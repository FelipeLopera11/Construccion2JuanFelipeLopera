
package veterinaria.adapters.seller;

/**
 *
 * @author Felipe Lopera
 */

import org.springframework.stereotype.Service;
import veterinaria.Ports.SellerPort;
import veterinaria.domain.models.Invoice;
import veterinaria.domain.models.MedicalOrder;

@Service
public class SellerAdapter implements SellerPort {

    @Override
    public void saveInvoice(Invoice invoice) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void consultMedicalOrder(MedicalOrder medicalorder) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    // Implementa los métodos de SellerPort aquí
}


