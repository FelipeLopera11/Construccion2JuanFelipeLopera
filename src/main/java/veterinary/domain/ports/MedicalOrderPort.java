
package veterinary.domain.ports;

/**
 *
 * @author Felipe Lopera
 */

import veterinary.domain.models.MedicalOrder;
        
public interface MedicalOrderPort {
    
    public void saveMedicalOrder(MedicalOrder medicalOrder);
    public void cancelMedicalOrder(MedicalOrder medicalorder);
    public MedicalOrder findByMedicalOrderId(MedicalOrder medicalorder);
    
}
