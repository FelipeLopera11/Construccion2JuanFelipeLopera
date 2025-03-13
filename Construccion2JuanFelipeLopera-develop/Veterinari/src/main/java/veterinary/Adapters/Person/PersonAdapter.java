
package veterinary.Adapters.Person;

/**
 *
 * @author Felipe Lopera
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import veterinary.Adapters.Person.Entity.PersonEntity;
import veterinary.Adapters.Person.Repository.PersonRepository;
import veterinary.domain.models.Person;
import veterinary.domain.ports.PersonPort;

@Service
public class PersonAdapter implements PersonPort  {
    
    	@Autowired
	private PersonRepository personRepository;
	
	@Override
	public boolean personExists(long personId) {
		return personRepository.existById(personId);
	}
	
	@Override
	public void savePerson(Person person) {
		PersonEntity entity = new PersonEntity(person.getId(), person.getName(), person.getAge(), person.getRole());
		personRepository.save(entity);
	}
}
