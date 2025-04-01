
package veterinary.Adapters.MedicalOrder;

/**
 *
 * @author Felipe Lopera
 */

import org.springframework.stereotype.Service;
import veterinary.domain.models.MedicalOrder;
import veterinary.domain.ports.MedicalOrderPort;

@Service
public class MedicalOrderAdapter implements MedicalOrderPort {

    @Override
    public void saveMedicalOrder(MedicalOrder medicalOrder) {
        
    }

    @Override
    public void cancelMedicalOrder(MedicalOrder medicalOrder) {
        
    }

    @Override
    public MedicalOrder findByMedicalOrderId(MedicalOrder medicalOrder) {
        return null;
    }
}
