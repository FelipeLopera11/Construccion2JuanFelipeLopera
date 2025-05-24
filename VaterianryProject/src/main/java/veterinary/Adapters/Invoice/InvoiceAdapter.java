
package veterinary.Adapters.Invoice;

/**
 *
 * @author Felipe Lopera
 */

import org.springframework.stereotype.Service;
import veterinary.domain.models.Invoice;
import veterinary.domain.ports.InvoicePort;

@Service
public class InvoiceAdapter implements InvoicePort {

    @Override
    public void saveInvoice(Invoice invoice) {
        
    }
}
