
package veterinary.domain.ports;

import veterinary.domain.models.Invoice;

/**
 *
 * @author Felipe Lopera
 */
public interface InvoicePort {
    
    public void saveInvoice(Invoice invoice);
    
}
