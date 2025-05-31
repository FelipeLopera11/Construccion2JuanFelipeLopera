
package veterinaria.adapters.Persons.repository;

/**
 *
 * @author Felipe Lopera
 */

import org.springframework.data.jpa.repository.JpaRepository;
import veterinaria.adapters.Persons.entity.PersonEntity;

public interface PersonRepository extends JpaRepository<PersonEntity, Long> { 
    
    boolean existsById(long id);
    PersonEntity findById(long id);
    

   
}

