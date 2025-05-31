
package veterinaria.adapters.clinicHistory.repository;

/**
 *
 * @author Felipe Lopera
 */

import org.springframework.data.jpa.repository.JpaRepository;

import veterinaria.adapters.clinicHistory.entity.ClinicHistoryEntity;
import veterinaria.adapters.medicalOrder.entity.MedicalOrderEntity;
import veterinaria.domain.models.ClinicHistory;
import veterinaria.domain.models.MedicalOrder;

public interface ClinicHistoryRepository extends JpaRepository<ClinicHistoryEntity, Long>{
    
    public boolean existsByOrderId(MedicalOrderEntity orderId);
    //public ClinicHistoryEntity findById(long id);
    
    
}
