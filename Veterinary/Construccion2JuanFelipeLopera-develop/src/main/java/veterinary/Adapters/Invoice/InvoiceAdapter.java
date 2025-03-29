
package veterinary.Adapters.Invoice;

/**
 *
 * @author Felipe Lopera
 */h

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import veterinary.Adapters.Invoice.Entity.InvoiceEntity;
import veterinary.Adapters.Invoice.Repository.InvoiceRepository;
import veterinary.domain.models.Invoice;
import veterinary.domain.ports.InvoicePort;

@Service
public class InvoiceAdapter implements InvoicePort{
    
    @Autowired
	private InvoiceRepository invoiceRepository;
	
    @Override
	public void saveInvoice(Invoice invoice) {
		invoiceRepository.save(new InvoiceEntity(invoice.getInvoiceId(), invoice.getPet()));
	}
    
}
