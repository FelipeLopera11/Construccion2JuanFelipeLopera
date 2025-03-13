
package veterinary.domain.services;

/**
 *
 * @author Felipe Lopera
 */

import veterinary.domain.models.Invoice;
import veterinary.domain.models.Person;
import veterinary.domain.ports.InvoicePort;

public class InvoiceService {
    
    
	private InvoicePort invoicePort;

	public InvoiceService(InvoicePort invoicePort) {
		super();
		this.invoicePort = invoicePort;
	}
	
	public void createInvoice(Person person, Invoice invoice) throws Exception {
		if (!person.getRole().equals("vendedor")) {
			throw new Exception("Solo los vendedores pueden generar facturas");
		}
		invoicePort.saveInvoice(invoice);
		System.out.println("Factura creada " + invoice.getPet().getPetName());
		
	}
}
