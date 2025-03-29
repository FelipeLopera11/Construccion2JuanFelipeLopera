
package veterinary.Adapters.MedicalOrder.Entity;

/**
 *
 * @author Felipe Lopera
 */

import veterinary.domain.models.Person;
import veterinary.domain.models.Pet;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="medical_orders")

public class MedicalOrderEntity {
    
    @Id
    private long orderId;
    private Pet petId;
    private Person veterinarian;
	
    public MedicalOrderEntity() {}
    public MedicalOrderEntity(long orderId, Pet pet, Person person) {
        super();
	this.orderId = orderId;
	this.petId = pet;
	this.veterinarian = person;
	}
}
