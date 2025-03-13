
package veterinary.domain.ports;

/**
 *
 * @author Felipe Lopera
 */

import veterinary.domain.models.Person;

public interface PersonPort {
    
    boolean personExists(long id);
    void savePerson(Person person);
    
}
