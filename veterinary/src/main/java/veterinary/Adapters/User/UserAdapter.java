package veterinary.Adapters.User;

import veterinary.Adapters.User.Entity.UserEntity;
import veterinary.Adapters.User.Repository.UserRepository;
import veterinary.Adapters.Person.Entity.PersonEntity;
import veterinary.domain.models.Person;
import veterinary.domain.models.User;
import veterinary.domain.ports.UserPort;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Felipe Lopera
 */

@Getter
@Setter
@NoArgsConstructor
@Service
public class UserAdapter implements UserPort {
    
    @Autowired
    private UserRepository userRepository;
    
    @Override
    public boolean existUserName(String userName) {
        return userRepository.existsByUserName(userName);
    }
    
    @Override
    public void saveUser(User user) {
        UserEntity userEntity = userEntityAdapter(user);
        userRepository.save(userEntity);
        user.setId(userEntity.getUserId());
    }

    private UserEntity userEntityAdapter(User user) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public User findByPersonId (Person person) {
        PersonEntity personEntity = personAdapter(person);
        UserEntity userEntity = userRepository.findByPersonId(personEntity);
        User user = userAdapter(userEntity);
        return user;
    }

    private PersonEntity personAdapter(Person person) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
    
    @Override
    public User findByUserName(User user) {
        UserEntity userEntity = userRepository.findByUserName(user.getUserName());
        if(userEntity == null){
            return null;
        }
        return userAdapter(userEntity);
    }
    
    
    private User userAdapter(UserEntity userEntity) {
    if (userEntity == null) {
        return null;
    }
    
    User user = new User();
    user.setId(userEntity.getUserId());
   
    user.setId(userEntity.getUserId()); 
    user.setUserName(userEntity.getUserName()); // Usar setUser Name
    user.setPassword(userEntity.getPassword()); // Usar setPassword
    user.setRole(userEntity.getRole()); // Usar setRole
    
    return user;

}

    @Override
    public User findByUserId(long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
