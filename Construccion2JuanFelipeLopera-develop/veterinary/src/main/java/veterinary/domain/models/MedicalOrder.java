
package veterinary.domain.models;

/**
 *
 * @author Felipe Lopera
 */

import java.sql.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class MedicalOrder {
    
    private long orderId;
	private Pet pet;
	private Person veterinarian;
	private String medicationName;
	private String dosage;
	private Date creationOrderDate;
	
	public MedicalOrder(long orderId, Pet pet, Person veterinarian, String medicationName, String dosage,
			Date creationOrderDate) {
		super();
		this.orderId = orderId;
		this.pet = pet;
		this.veterinarian = veterinarian;
		this.medicationName = medicationName;
		this.dosage = dosage;
		this.creationOrderDate = creationOrderDate;
	}

}
