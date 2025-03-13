
package veterinary.domain.services;

/**
 *
 * @author Felipe Lopera
 */
import veterinary.domain.models.Person;
import veterinary.domain.models.Pet;
import veterinary.domain.ports.PetPort;

public class PetService {
    
    private PetPort petsPort;

	public PetService(PetPort petsPort) {
		this.petsPort = petsPort;
	}
	
	public void registerPet(Pet pet, Person person) throws Exception {
		if (!person.getRole().equals("Dueño")) {
			throw new Exception("Para registrar una mascota debe estar asociada a un dueño");
		}
		if (petsPort.petExists(pet.getPetId())) {
			throw new Exception("La mascota ya esta registrada");
		}
		petsPort.savePet(pet);
		System.out.println("Mascota registrada: " + pet.getPetName());
		
        }
    
}
