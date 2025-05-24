
package veterinary.domain.ports;

import veterinary.domain.models.Invoice;
import veterinary.domain.models.MedicalOrder;

/**
 *
 * @author Felipe Lopera
 */
public interface SellerPort {
    
    public void saveInvoice(Invoice invoice);
    public void consultMedicalOrder(MedicalOrder medicalorder);
}