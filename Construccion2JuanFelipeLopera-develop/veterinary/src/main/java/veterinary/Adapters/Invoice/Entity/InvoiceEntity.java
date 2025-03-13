
package veterinary.Adapters.Invoice.Entity;

/**
 *
 * @author Felipe Lopera
 */
import veterinary.domain.models.Pet;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="invoices")

public class InvoiceEntity {
    
    	@Id
	private long invoiceId;
	private long petId;
	private double amount;
	
	public InvoiceEntity(String string, Pet pet) {}

	public InvoiceEntity(long invoiceId, long petId, double amount) {
		super();
		this.invoiceId = invoiceId;
		this.petId = petId;
		this.amount = amount;
	}
}
