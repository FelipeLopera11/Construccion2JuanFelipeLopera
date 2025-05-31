
package veterinaria.adapters.Invoice;

/**
 *
 * @author Felipe Lopera
 */

import org.springframework.stereotype.Service;
import veterinaria.domain.models.Invoice;
import veterinaria.Ports.InvoicePort;

@Service
public class InvoiceAdapter implements InvoicePort {

    @Override
    public void saveInvoice(Invoice invoice) {
        
    }
}
