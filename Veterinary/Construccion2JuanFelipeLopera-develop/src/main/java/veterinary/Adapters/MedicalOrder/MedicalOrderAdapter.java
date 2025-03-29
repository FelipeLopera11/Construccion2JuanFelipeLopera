
package veterinary.Adapters.MedicalOrder;

/**
 *
 * @author Felipe Lopera
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import veterinary.Adapters.MedicalOrder.Entity.MedicalOrderEntity;
import veterinary.Adapters.MedicalOrder.Repository.MedicalOrderRepository;
import veterinary.domain.models.MedicalOrder;
import veterinary.domain.ports.MedicalOrderPort;

@Service
public class MedicalOrderAdapter implements MedicalOrderPort{
    
    @Autowired
	private MedicalOrderRepository orderRepository;
	
	@Override
	public void saveMedicalOrder(MedicalOrder medicalOrder) {
		orderRepository.save(new MedicalOrderEntity(medicalOrder.getOrderId(), medicalOrder.getPet(), medicalOrder.getVeterinarian()));
	}

	@Override
	public void cancelMedicalOrder(long orderId) {
		orderRepository.deleteById(orderId);
	}

	@Override
	public List<MedicalOrder> getMedicalOrders() {
		return orderRepository.findAll();
	}
}
