
package veterinaria.adapters.Users.Repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import veterinaria.adapters.Persons.entity.PersonEntity;
import veterinaria.adapters.Users.entity.UserEntity;
import veterinaria.domain.models.User;

/**
 * 
 *
 * @author Felipe Lopera
 */
public interface UserRepository extends JpaRepository<UserEntity, Long>{
    
    public boolean existsByUserName(String userName);
    
    public UserEntity findByPersonId(PersonEntity personEntity);
    
    public UserEntity findByUserName(String userName);

   Optional<UserEntity> findById(Long userId);
    
    
}
