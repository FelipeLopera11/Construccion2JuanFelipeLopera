package veterinary.domain.services;

import veterinary.domain.models.ClinicHistory;
import veterinary.domain.models.Pet;
import veterinary.domain.models.MedicalOrder;
import veterinary.domain.models.Person;
import veterinary.domain.models.User;
import veterinary.domain.ports.PersonPort;
import veterinary.domain.ports.PetPort;
import veterinary.domain.ports.InvoicePort;
import veterinary.domain.ports.UserPort;
import veterinary.domain.ports.MedicalOrderPort;
import veterinary.domain.ports.ClinicHistoryPort;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Felipe Lopera
 */
@Getter
@Setter
@Service
public class VeterinarianService {
    
    @Autowired
    private PetPort petPort;
    @Autowired
    private UserPort userPort;
    @Autowired
    private MedicalOrderPort medicalOrderPort;
    @Autowired
    private ClinicHistoryPort clinicHistoryPort;
    @Autowired
    private PersonPort personPort;
    @Autowired
    private InvoicePort invoicePort;
    
    
   public void createClinicHistory(ClinicHistory clinicHistory) throws Exception {
   
        Pet pet = petPort.findByPetId(clinicHistory.getPet());
            if (pet == null) {
                throw new Exception("La mascota no existe");
            }

    
       User veterinarian = userPort.findByUserId(clinicHistory.getVeterinarian().getId());
            if (veterinarian == null) {
                throw new Exception("El veterinario no existe");
            }

   
         MedicalOrder medicalOrder = medicalOrderPort.findByMedicalOrderId(clinicHistory.getOrderId());
            if (medicalOrder == null || medicalOrder.getPet().getId() != pet.getId()) {
                throw new Exception("No existe la orden médica asociada a esta mascota");
            }

    
        clinicHistory.setPet(pet);
        clinicHistory.setVeterinarian(veterinarian);
        clinicHistory.setOrderId(medicalOrder);

   
        clinicHistoryPort.saveClinicHistory(clinicHistory);
    }
    
    public void createOwner(Person owner) throws Exception {
        if (personPort.existPerson(owner.getId())) {
            throw new Exception("El dueño ya existe");
        }
    
        personPort.savePerson(owner);
    }
    
    public void createPet(Pet pet) throws Exception {
    
        Person owner = personPort.findById(pet.getId().getId());
            if (owner == null) {
                throw new Exception("El dueño no existe");
            }
    
    
        pet.setDocument(owner);
        petPort.savePet(pet);
    }
    
    public void createOrder(MedicalOrder medicalOrder) throws Exception {
        
        MedicalOrder existingOrder = medicalOrderPort.findByMedicalOrderId(medicalOrder);
    
            if (existingOrder != null) {
                throw new Exception("La orden ya existe");
            }

        medicalOrderPort.saveMedicalOrder(medicalOrder);
    }
    
    public void cancelOrder(MedicalOrder medicalOrder) throws Exception {
    
        MedicalOrder existingOrder = medicalOrderPort.findByMedicalOrderId(medicalOrder);
            if (existingOrder == null) {
                throw new Exception("No existe la orden médica para cancelar");
            }
            
        medicalOrderPort.cancelMedicalOrder(medicalOrder);
    }
    
    public void visualizeOrder(MedicalOrder medicalOrder) throws Exception {

        Pet pet = petPort.findByPetId(medicalOrder.getPet());
            if (pet == null) {
                throw new Exception("La masta asociada a la orden no existe");
            }

 
        MedicalOrder existingOrder = medicalOrderPort.findByMedicalOrderId(medicalOrder);
            if (existingOrder == null) {
                 throw new Exception("La orden médica no es válida");
            }

        medicalOrderPort.findByMedicalOrderId(existingOrder);
        visualizeOrder(medicalOrder);
    }
    
    public void visualizeClinicHistory(ClinicHistory clinicHistory) throws Exception {
    
         Pet pet = petPort.findByPetId(clinicHistory.getPet());
            if (pet == null) {
                throw new Exception("La mascota asociada a la historia clínica no existe");
            }

 
        User veterinarian = userPort.findByUserId(clinicHistory.getVeterinarian().getId());
            if (veterinarian == null) {
                throw new Exception("El veterinario asociado a la historia clínica no existe");
            }

        System.out.println("Detalles de la Historia Clínica:");
        System.out.println("ID de la Historia Clínica: " + clinicHistory.getOrderId());
        System.out.println("ID de la Mascota: " + clinicHistory.getPet().getId());
        System.out.println("Veterinario: " + veterinarian.getName());
        
        clinicHistoryPort.clinicHistoryVisualizer(clinicHistory);
        visualizeClinicHistory(clinicHistory);
  
    }
    
}