
package veterinary.domain.services;

/**
 *
 * @author Felipe Lopera
 */
import veterinary.domain.models.ClinicHistory;
import veterinary.domain.models.Person;
import veterinary.domain.models.Pet;
import veterinary.domain.ports.ClinicHistoryPort;

public class ClinicHistoryService {
    
    private ClinicHistoryPort clinicHistoryPort;

	public ClinicHistoryService(ClinicHistoryPort cliniclHistoryPort) {
		this.clinicHistoryPort = clinicHistoryPort;
	}
	
	public void viewMedicalHistory(Person person, Pet pet) throws Exception {
		if(!person.getRole().equals("Veterinario")) {
			throw new Exception("Solo los veterinarios pueden consultar la historia clinica");
		}
	
		ClinicHistory history = clinicHistoryPort.getClinicHistory(pet);
		System.out.println("Consultado historia clinica... " + history.getPet().getPetName());
	}
		
		public void updateMedicalHistory(Person person, ClinicHistory history) throws Exception {
			if(!person.getRole().equals("Veterinario")) {
				throw new Exception("Solo los veterinarios pueden consultar la historia clinica");
			}
		clinicHistoryPort.saveClinicHistory(history);
		System.out.println("Historia clinica actualizada... " + history.getPet().getPetName());
		
	}
	
    
}
