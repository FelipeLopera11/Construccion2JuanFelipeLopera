
package veterinary.domain.ports;

import veterinary.domain.models.Invoice;

/**
 *
 * @author Felipe Lopera
 */
public interface InvoicePort {
    
    void saveInvoice(Invoice invoice);
    
}
