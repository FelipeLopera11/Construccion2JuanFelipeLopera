
package veterinaria.adapters.Invoice.repository;

/**
 *
 * @author Felipe Lopera
 */

import org.springframework.data.jpa.repository.JpaRepository;
import veterinaria.adapters.Invoice.entity.InvoiceEntity;

public interface InvoiceRepository extends JpaRepository<InvoiceEntity, String> {

}
