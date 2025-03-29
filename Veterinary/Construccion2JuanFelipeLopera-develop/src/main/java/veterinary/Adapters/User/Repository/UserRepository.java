
package veterinary.Adapters.User.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import veterinary.Adapters.Person.Entity.PersonEntity;
import veterinary.Adapters.User.Entity.UserEntity;
import veterinary.domain.models.User;

/**
 * 
 *
 * @author Felipe Lopera
 */
public interface UserRepository extends JpaRepository<UserEntity, Long>{
    
    public boolean existsByUserName(String userName);
    
    public UserEntity findByPersonId(PersonEntity personEntity);
    
    public UserEntity findByUserName(String userName);


    
    
    
}
