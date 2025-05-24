
package veterinary.domain.ports;

import veterinary.domain.models.MedicalOrder;

/**
 *
 * @author Felipe Lopera
 */
public interface VeterinarianPort {
    
    public void consultClinicHistory();
    public void createMedicalOrder(MedicalOrder medicalorder);
    public void consultMedicalOrder(MedicalOrder medicalorder);
    
}