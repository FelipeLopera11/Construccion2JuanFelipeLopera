
package veterinaria.adapters.pet.repository;

/**
 *
 * @author Felipe Lopera
 */

import org.springframework.data.jpa.repository.JpaRepository;
import veterinaria.adapters.pet.entity.PetEntity;

public interface PetRepository extends JpaRepository<PetEntity, Long>{
    
     
    boolean existsById(long petId);
    PetEntity findById(long petId );
}
