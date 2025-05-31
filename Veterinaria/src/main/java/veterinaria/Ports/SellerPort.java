
package veterinaria.Ports;

import veterinaria.domain.models.Invoice;
import veterinaria.domain.models.MedicalOrder;

/**
 *
 * @author Felipe Lopera
 */
public interface SellerPort {
    
    public void saveInvoice(Invoice invoice);
    public void consultMedicalOrder(MedicalOrder medicalorder);
}
