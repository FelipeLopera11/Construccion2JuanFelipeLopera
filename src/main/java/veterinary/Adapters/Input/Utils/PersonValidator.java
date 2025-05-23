
package veterinary.Adapters.Input.Utils;
import org.springframework.stereotype.Component;


/**
 *
 * @author Felipe Lopera
 */

@Component
public class PersonValidator extends SimpleValidator{
    
    public String nameValidator(String value) throws Exception {
       return stringValidator(value, "nombre de la persona");
    }
    
    public long idValidator(String value) throws Exception {
        return longValidator(value, " ID de la persona ");
    }

    public int ageValidator(String value) throws Exception {
        return integerValidator(value, "edad");
    }

    public String roleValidator(String value) throws Exception {
        return stringValidator(String.valueOf(value), "rol de la persona");
    }
    
}