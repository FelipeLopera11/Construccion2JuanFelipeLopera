package veterinary.domain.services;


import veterinary.domain.models.User;
import veterinary.domain.ports.PersonPort;
import veterinary.domain.ports.SellerPort;
import veterinary.domain.ports.UserPort;
import veterinary.domain.ports.VeterinarianPort;
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
    
}
