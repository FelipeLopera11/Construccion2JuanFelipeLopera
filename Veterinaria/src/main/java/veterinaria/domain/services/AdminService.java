
package veterinaria.domain.services;

/**
 *
 * @author Felipe Lopera
 */

import java.util.List;
import veterinaria.domain.models.User;
import veterinaria.Ports.PersonPort;
import veterinaria.Ports.SellerPort;
import veterinaria.Ports.UserPort;
import veterinaria.Ports.VeterinarianPort;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author Felipe Lopera
 */

@Setter
@Getter
@NoArgsConstructor
@Service
public class AdminService {
    
    @Autowired
    private PersonPort personPort;
    @Autowired
    private UserPort userPort;
    @Autowired
    private SellerPort sellerPort;
    @Autowired
    private VeterinarianPort veterinarianPort;

    
    
    
    
    public void registerUser(User user)throws Exception{
        if(personPort.existPerson(user.getId())){
            throw new Exception("Ya existe una persona con esta cedula");
        } 
        if(userPort.existUserName(user.getUserName())){
            throw new Exception("Ya existe una persona con este userName");
        }
        
        if(!user.getRole().equals("veterinario") && !user.getRole().equals("vendedor")){
            throw new Exception("rol invalido");
        }
        userPort.saveUser(user);
    }
    
    public List<User> getUsers(){
        return userPort.getAllUsers();
    }
    
    public User getUser(long userId) throws Exception {
    return userPort.getUserById(userId)
            .orElseThrow(() -> new Exception("Usuario no encontrado"));
    }
    
}

