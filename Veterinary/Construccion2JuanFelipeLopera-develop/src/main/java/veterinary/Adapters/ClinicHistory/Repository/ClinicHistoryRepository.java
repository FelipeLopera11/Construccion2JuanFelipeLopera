
package veterinary.Adapters.ClinicHistory.Repository;

/**
 *
 * @author Felipe Lopera
 */
import org.springframework.data.jpa.repository.JpaRepository;

import veterinary.Adapters.ClinicHistory.Entity.ClinicHistoryEntity;
import veterinary.domain.models.ClinicHistory;
import veterinary.domain.models.MedicalOrder;

public interface ClinicHistoryRepository extends JpaRepository<ClinicHistoryEntity, Long>{
    
    public boolean existByMedicalOrderId(MedicalOrder medicalOrder);
    public void saveClinicHistory(ClinicHistory ClinicHistory);
    public ClinicHistoryEntity findById();
    
}
