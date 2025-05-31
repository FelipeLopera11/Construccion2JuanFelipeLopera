
package veterinaria.adapters.medicalOrder.repository;

/**
 *
 * @author Felipe Lopera
 */

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import veterinaria.adapters.medicalOrder.entity.MedicalOrderEntity;
import veterinaria.domain.models.MedicalOrder;

public interface MedicalOrderRepository extends JpaRepository<MedicalOrderEntity, String> {

	MedicalOrderEntity save(MedicalOrderEntity medicalOrderEntity);

	void deleteById(long orderId);

	List findAll();

}
