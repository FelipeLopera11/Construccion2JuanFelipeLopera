package veterinary.Adapters.Input;


import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import veterinary.Adapters.Input.Utils.UserValidator;
import veterinary.Adapters.Input.Utils.Utils;
import veterinary.domain.models.User;
import veterinary.domain.ports.InputPort;


/**
 *
 * @author Felipe Lopera
 */

@Component
public class LoginInput implements InputPort {

    private Map<String, InputPort> inputs;

    @Autowired
    private AdminInput adminInput;
    @Autowired
    private UserValidator userValidator;

    private final String MENU = "Ingrese la opción que desea:\n 1. Iniciar sesión \n 2. Salir";

    @Autowired
    public LoginInput(AdminInput adminInput) {
        this.adminInput = adminInput;
        this.inputs = new HashMap<>();
        inputs.put("admin", adminInput);
    }

    @Override
    public void menu() throws Exception {
        System.out.println(MENU);
        String option = Utils.getReader().nextLine();
        switch (option) {
            case "1":
                this.login();
                break;
            case "2":
                System.out.println("Hasta una próxima ocasión");
                return;
            default:
                System.out.println("Ha elegido una opción inválida, se detiene la ejecución");
                return;
        }
    }

    private void login() {
        try {
            System.out.println("Ingrese su usuario:");
            String userName = userValidator.userNameValidator(Utils.getReader().nextLine());
            System.out.println("Ingrese su contraseña:");
            String password = userValidator.passwordValidator(Utils.getReader().nextLine());

            User user = new User();
            user.setUserName(userName);
            user.setPassword(password);
            
            
            if ("admin".equals(user.getRole())) {
                adminInput.menu();
            } else {
                System.out.println("Acceso denegado. Solo los administradores pueden iniciar sesión.");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
