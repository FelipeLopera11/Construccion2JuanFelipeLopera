
package veterinary.Adapters.Pet.Repository;

/**
 *
 * @author Felipe Lopera
 */
import org.springframework.data.jpa.repository.JpaRepository;
import veterinary.Adapters.Pet.Entity.PetEntity;

public interface PetRepository extends JpaRepository<PetEntity, String>{
    
    boolean existsById(long petId);
    
}
