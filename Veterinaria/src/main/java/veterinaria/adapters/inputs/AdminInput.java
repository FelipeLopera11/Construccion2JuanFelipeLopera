
package veterinaria.adapters.inputs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import veterinaria.adapters.rest.utils.PersonValidator;
import veterinaria.adapters.rest.utils.UserValidator;
import veterinaria.adapters.rest.utils.Util;
import veterinaria.domain.models.User;
import veterinaria.domain.models.Person;
import veterinaria.Ports.InputPort;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/**
 *
 * @author Felipe Lopera
 */

@Setter
@Getter
@NoArgsConstructor
@Component
public class AdminInput implements InputPort{
    
     
    @Autowired
    private PersonValidator personValidator;
    
    @Autowired
    private UserValidator userValidator;

    private final String MENU = "Ingrese la opción:"
            + " \n 1. Crear usuario."
            + " \n 2. Ver detalles de usuario."
            + " \n 3. Actualizar contraseña de usuario."
            + " \n 4. Eliminar usuario.";
    
    public void menu() {
        System.out.println(MENU);
        String option = Util.getReader().nextLine();
        switch (option) {
        case "1": {
            try {
                this.createUser();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            break;
        }
        case "2": {
            try {
                this.viewUserDetails();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            break;
        }
        case "3": {
            try {
                this.updateUserPassword();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            break;
        }
        case "4": {
            try {
                this.deleteUser();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            break;
        }
        default:
            System.out.println("Opción no válida.");
        }
    }
    
    private void createUser() throws Exception {
        System.out.println("Ingrese el nombre del usuario:");
        String name = personValidator.nameValidator(Util.getReader().nextLine());
        System.out.println("Ingrese el documento del usuario:");
        long id = personValidator.idValidator(Util.getReader().nextLine());
        System.out.println("Ingrese el nombre de usuario:");
        String userName = userValidator.userNameValidator(Util.getReader().nextLine());
        System.out.println("Ingrese la contraseña del usuario:");
        String password = userValidator.passwordValidator(Util.getReader().nextLine());
        
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setUserName(userName);
        user.setPassword(password);
        user.setRole("user");
        
        
        System.out.println("Usuario creado con éxito.");
    }

    private void viewUserDetails() throws Exception {
        System.out.println("Ingrese el nombre de usuario:");
        String userName = userValidator.userNameValidator(Util.getReader().nextLine());
        

        System.out.println("Detalles del usuario: [Aquí irían los detalles del usuario].");
    }

    private void updateUserPassword() throws Exception {
        System.out.println("Ingrese el nombre de usuario:");
        String userName = userValidator.userNameValidator(Util.getReader().nextLine());
        
        System.out.println("Ingrese la nueva contraseña:");
        String newPassword = userValidator.passwordValidator(Util.getReader().nextLine());
        
        
        System.out.println("Contraseña actualizada con éxito.");
    }

    private void deleteUser() throws Exception {
        System.out.println("Ingrese el nombre de usuario para eliminar:");
        String userName = userValidator.userNameValidator(Util.getReader().nextLine());
        
        
        System.out.println("Usuario eliminado con éxito.");
    }
    
}
