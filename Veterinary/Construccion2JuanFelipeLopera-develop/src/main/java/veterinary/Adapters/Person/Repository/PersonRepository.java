package veterinary.Adapters.Person.Repository;

/**
 *
 * @author Felipe Lopera
 */

import org.springframework.data.jpa.repository.JpaRepository;
import veterinary.Adapters.Person.Entity.PersonEntity;

public interface PersonRepository extends JpaRepository<PersonEntity, Long> { 
    
    boolean existsById(long id);
    PersonEntity findById(long id);

   
}
