
package veterinary.domain.services;

/**
 *
 * @author Felipe Lopera
 */
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import veterinary.domain.models.Person;
import veterinary.domain.ports.PersonPort;

public class PersonService {
    
    private PersonPort personPort;
	
	public PersonService(PersonPort personPort) {
		this.personPort = personPort;
		
		Person defaultAdmin = new Person(01, "Admin Principal", 40, "Administrador");
		if (!personPort.personExists(defaultAdmin.getId()) ) {
			personPort.savePerson(defaultAdmin);
			System.out.println("Administrador creado por defecto: " + defaultAdmin.getName());
		}
		
	}
	
	public void registerPerson(Person admin, Person person) throws Exception {
		if (!person.getRole().equals("Administrator")) {
			throw new Exception("Solo los administradores pueden registrar personas");
		}
		if (personPort.personExists(person.getId())) {
			throw new Exception("La persona ya existe");
		}
		personPort.savePerson(person);
		System.out.println("Persona registrada:" + person.getName());
		
		
	}
	
    
}
