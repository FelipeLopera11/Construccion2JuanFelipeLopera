package veterinary.domain.services;

import veterinary.domain.ports.SellerPort;
import veterinary.domain.ports.PersonPort;
import veterinary.domain.ports.InvoicePort;
import veterinary.domain.ports.PetPort;
import veterinary.domain.ports.MedicalOrderPort;
import veterinary.domain.models.Person;
import veterinary.domain.models.Invoice;
import veterinary.domain.models.MedicalOrder;
import veterinary.domain.models.Pet;
import java.time.LocalDate;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Felipe Lopera
 */
@Setter
@Getter
@NoArgsConstructor
@Service
public class SellerService {
    
    @Autowired
    private SellerPort sellerPort;
    
    @Autowired
    private PersonPort personPort;
    
    @Autowired
    private InvoicePort invoicePort;
    
    @Autowired
    private PetPort petPort;
    
    @Autowired
    private MedicalOrderPort medicalOrderPort;
   
    public void registerInvoice(Long id) throws Exception {
        if (!personPort.existPerson(id)) {
            throw new Exception("No existe una persona con esta cédula");
        }
        Person person = personPort.findById(id);
        if(person == null){
            throw new Exception("La persona no fue encontrada");
        }
        
        Invoice invoice = new Invoice();
        invoice.setId(person);
        sellerPort.saveInvoice(invoice);
    }
     
    public void consultMedicalOrder(MedicalOrder medicalOrder) throws Exception {
        if (!personPort.existPerson(medicalOrder.getPerson().getId())) {
            throw new Exception("No existe una persona con esta cédula");
        }
        sellerPort.consultMedicalOrder(medicalOrder);
    }
    
    public void sell(Invoice invoice, String SellerRole) throws Exception {
        if (invoice == null) {
            throw new Exception("La factura (invoice) es null");
        }    
        
        if(!SellerRole.equals("seller")){
            throw new Exception("Solo los vendedores pueden hacer ventas");
        }
        
        Pet pet = petPort.findByPetId(invoice.getPet());
        if (pet == null) {
            throw new Exception("No existe la mascota");
        }
        
        invoice.setId(pet.getId()); //Agrega el id del dueño de la mascota a la factura.
        
        if(invoice.getMedicalOrder() != null){// valida la orden medica.
            MedicalOrder medicalOrder = medicalOrderPort.findByMedicalOrderId(invoice.getMedicalOrder());
            if (medicalOrder == null) {
                throw new Exception("La orden médica es inválida");
            }
            invoice.setMedicalOrder(medicalOrder);
        }
        
        invoice.setPet(pet);
        invoice.setId(pet.getId());
        invoicePort.saveInvoice(invoice);
    }
}
