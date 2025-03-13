
package veterinary.Adapters.Person.Repository;

/**
 *
 * @author Felipe Lopera
 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import veterinary.Adapters.Person.Entity.PersonEntity;

@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, String>{
    
    boolean existById(long personId);
    
}
