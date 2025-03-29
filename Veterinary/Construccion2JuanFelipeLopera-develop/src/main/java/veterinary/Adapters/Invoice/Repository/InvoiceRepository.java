
package veterinary.Adapters.Invoice.Repository;

/**
 *
 * @author Felipe Lopera
 */
import org.springframework.data.jpa.repository.JpaRepository;

import veterinary.Adapters.Invoice.Entity.InvoiceEntity;

public interface InvoiceRepository extends JpaRepository<InvoiceEntity, String> {

}
