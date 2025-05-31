
package veterinaria.Ports;

/**
 *
 * @author Felipe Lopera
 */

import veterinaria.domain.models.MedicalOrder;
        
public interface MedicalOrderPort {
    
    public void saveMedicalOrder(MedicalOrder medicalOrder);
    public void cancelMedicalOrder(MedicalOrder medicalorder);
    public MedicalOrder findByMedicalOrderId(MedicalOrder medicalorder);
    
}
