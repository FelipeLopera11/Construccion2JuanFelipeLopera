
package veterinary.Adapters.Rest;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import Exceptions.BusinessException;
import Exceptions.InputsException;
import Exceptions.NotFoundException;
import veterinary.Adapters.Rest.Request.UserRequest;
import veterinary.Adapters.Rest.Response.UserResponse;
import veterinary.domain.models.User;
import veterinary.domain.services.AdminService;
import veterinary.Adapters.Input.Utils.UserValidator;


/**
 *
 * @author Felipe Lopera
 */

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @Autowired
    private UserValidator userValidator;

    // Endpoint básico para verificar si el servicio está activo
    @GetMapping("/")
    public String itsAlive() {
        return "I'm alive";
    }

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

    // Crear usuario
    @PostMapping("/user")
    public ResponseEntity createUser(@RequestBody UserRequest request) {
        try {
            User user = new User();
            user.setName(userValidator.userNameValidator(request.getName()));
            user.setUserName(userValidator.userNameValidator(request.getUserName()));
            user.setPassword(userValidator.passwordValidator(request.getPassword()));

            user.setRole(request.getRole());

            adminService.registerUser(user);
            return new ResponseEntity("Usuario creado correctamente", HttpStatus.OK);
        } catch (BusinessException be) {
            return new ResponseEntity(be.getMessage(), HttpStatus.CONFLICT);
        } catch (InputsException ie) {
            return new ResponseEntity(ie.getMessage(), HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Obtener todos los usuarios
    @GetMapping("/users")
    public ResponseEntity getUsers() {
        try {
            List<User> users = adminService.getUsers();
            List<UserResponse> usersResponse = new ArrayList<>();
            for (User user : users) {
                usersResponse.add(adapter(user));
            }
            return new ResponseEntity(usersResponse, HttpStatus.OK);
        } catch (Exception e) {
           return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Obtener un usuario por documento
   @GetMapping("/user/{userId}")
    public ResponseEntity getUser(@PathVariable long userId) {
        try {
            User user = adminService.getUser(userId);
            UserResponse userResponse = adapter(user);
            return new ResponseEntity(userResponse, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    // Método para convertir User a UserResponse
    private UserResponse adapter(User user) {
        UserResponse userResponse = new UserResponse();
        userResponse.setRole(user.getRole());
        userResponse.setUserName(user.getUserName());
        userResponse.setName(user.getName());
        return userResponse;
    }
}

