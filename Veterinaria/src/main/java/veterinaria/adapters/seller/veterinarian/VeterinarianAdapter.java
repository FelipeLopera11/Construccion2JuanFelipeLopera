
package veterinaria.adapters.seller.veterinarian;

/**
 *
 * @author Felipe Lopera
 */

import org.springframework.stereotype.Service;
import veterinaria.Ports.VeterinarianPort;
import veterinaria.domain.models.MedicalOrder;

@Service
public class VeterinarianAdapter implements VeterinarianPort {

    @Override
    public void consultClinicHistory() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void createMedicalOrder(MedicalOrder medicalorder) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void consultMedicalOrder(MedicalOrder medicalorder) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


