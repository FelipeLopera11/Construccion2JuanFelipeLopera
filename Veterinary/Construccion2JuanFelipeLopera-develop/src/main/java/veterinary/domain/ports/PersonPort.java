
package veterinary.domain.ports;

/**
 *
 * @author Felipe Lopera
 */

import veterinary.domain.models.Person;

public interface PersonPort {
    
    public boolean existPerson(long id);
    public void savePerson(Person person);
    public Person findById(long id);

}
   
   