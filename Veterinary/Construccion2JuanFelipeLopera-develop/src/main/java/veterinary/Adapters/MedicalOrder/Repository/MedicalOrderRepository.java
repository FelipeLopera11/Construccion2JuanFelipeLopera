
package veterinary.Adapters.MedicalOrder.Repository;

/**
 *
 * @author Felipe Lopera
 */

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import veterinary.Adapters.MedicalOrder.Entity.MedicalOrderEntity;
import veterinary.domain.models.MedicalOrder;

public interface MedicalOrderRepository extends JpaRepository<MedicalOrderEntity, String> {

	MedicalOrderEntity save(MedicalOrderEntity medicalOrderEntity);

	void deleteById(long orderId);

	List findAll();

}
