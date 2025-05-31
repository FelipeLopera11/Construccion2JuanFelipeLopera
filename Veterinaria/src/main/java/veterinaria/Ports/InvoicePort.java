
package veterinaria.Ports;

import veterinaria.domain.models.Invoice;

/**
 *
 * @author Felipe Lopera
 */
public interface InvoicePort {
    
    public void saveInvoice(Invoice invoice);
    
}
