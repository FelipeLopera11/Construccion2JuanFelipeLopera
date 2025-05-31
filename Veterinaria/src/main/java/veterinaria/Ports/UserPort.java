
package veterinaria.Ports;

import java.util.List;
import java.util.Optional;
import veterinaria.domain.models.Person;
import veterinaria.domain.models.User;

/**
 *
 * @author Felipe Lopera
 */
public interface UserPort {
    
    public boolean existUserName(String userName);
    public void saveUser(User user);
    public User findByPersonId(Person person);
    public User findByUserName(User user);

    public User findByUserId(long id);
    
    List<User> getAllUsers();
    Optional<User> getUserById(long id);
}

