
package veterinary.domain.services;

/**
 *
 * @author Felipe Lopera
 */

import java.util.List;
import veterinary.domain.models.MedicalOrder;
import veterinary.domain.models.Person;
import veterinary.domain.ports.MedicalOrderPort;

public class MedicalOrderService {
    
    
	private MedicalOrderPort medicalOrderPort;

	public MedicalOrderService(MedicalOrderPort medicalOrderPort) {
		this.medicalOrderPort = medicalOrderPort;
	}
	
	public void createMedicalOrder(Person person, MedicalOrder order, String medicationName) throws Exception {
		if(!person.getRole().equals("Veterinario")) {
			throw new Exception("Solo los veterinarios pueden crear ordenes medicas");
		}
		if (medicationName == null || medicationName.isEmpty()) {
			throw new Exception("Orden sin medicamentos no es valida");
		}
		medicalOrderPort.saveMedicalOrder(order);
		System.out.println("Orden médica creada para: " +order.getPet().getPetName());
		}
	
	public void cancelMedicalOrder(Person person, long orderId) throws Exception {
		if(!person.getRole().equals("Veterinario")) {
			throw new Exception("Solo los veterinarios pueden anular ordenes");
		}
		medicalOrderPort.cancelMedicalOrder(orderId);
		System.out.println("orden médica anulada con ID: " + orderId);		
	}
	
	public List<MedicalOrder> getMedicalOrders() {
		return medicalOrderPort.getMedicalOrders();
	}
    
}
