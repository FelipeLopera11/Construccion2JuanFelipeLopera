
package veterinaria.adapters.medicalOrder;

/**
 *
 * @author Felipe Lopera
 */

import org.springframework.stereotype.Service;
import veterinaria.domain.models.MedicalOrder;
import veterinaria.Ports.MedicalOrderPort;

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
