
package veterinary.domain.models;

/**
 *
 * @author Felipe Lopera
 */

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class ClinicHistory {
    
    
	private Pet pet;
	private List<MedicalRecord> records;
	
	public ClinicHistory(Pet pet, List<MedicalRecord> records) {
		super();
		this.pet = pet;
		this.records = records;
	}
}
