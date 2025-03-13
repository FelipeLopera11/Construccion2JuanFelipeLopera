
package veterinary.domain.ports;

/**
 *
 * @author Felipe Lopera
 */

import java.util.List;
import veterinary.domain.models.MedicalOrder;
        
public interface MedicalOrderPort {
    
    void saveMedicalOrder(MedicalOrder medicalOrder);
    void cancelMedicalOrder(long orderId);
    List<MedicalOrder> getMedicalOrders();
}
