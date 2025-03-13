
package veterinary.Adapters.ClinicHistory.Repository;

/**
 *
 * @author Felipe Lopera
 */
import org.springframework.data.jpa.repository.JpaRepository;

import veterinary.Adapters.ClinicHistory.Entity.ClinicHistoryEntity;
import veterinary.domain.models.ClinicHistory;
import veterinary.domain.models.Pet;

public interface ClinicHistoryRepository extends JpaRepository<ClinicHistoryEntity, String>{
    
    ClinicHistory findByPet(Pet pet);
    
}
