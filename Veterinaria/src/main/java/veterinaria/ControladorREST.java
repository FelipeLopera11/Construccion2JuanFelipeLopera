
package veterinaria;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Felipe Lopera
 */

@RestController
public class ControladorREST {
    
    @GetMapping("/")
    public String comienzo(){
        
        return "Hola Mundo en spring";
    }
    
}
