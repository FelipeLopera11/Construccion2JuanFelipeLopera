
package veterinaria.Ports;

import veterinaria.domain.models.MedicalOrder;

/**
 *
 * @author Felipe Lopera
 */
public interface VeterinarianPort {
    
    public void consultClinicHistory();
    public void createMedicalOrder(MedicalOrder medicalorder);
    public void consultMedicalOrder(MedicalOrder medicalorder);
    
}
