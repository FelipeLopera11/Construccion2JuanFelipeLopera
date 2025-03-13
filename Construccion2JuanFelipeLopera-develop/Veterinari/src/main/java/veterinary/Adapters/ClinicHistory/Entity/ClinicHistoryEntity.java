
package veterinary.Adapters.ClinicHistory.Entity;

/**
 *
 * @author Felipe Lopera
 */
import java.util.List;

import veterinary.domain.models.MedicalRecord;
import veterinary.domain.models.Pet;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="clinic_histories")

public class ClinicHistoryEntity {
    
    @Id
    private Pet pet;
    @ElementCollection
    private List<MedicalRecord> records;
	
    public ClinicHistoryEntity() {}
    public ClinicHistoryEntity(Pet pet, List<MedicalRecord> list) {
        super();
        this.pet = pet;
        this.records = list;
	}
}
