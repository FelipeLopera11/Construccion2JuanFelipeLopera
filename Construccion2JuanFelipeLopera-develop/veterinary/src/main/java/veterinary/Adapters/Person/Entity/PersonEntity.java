
package veterinary.Adapters.Person.Entity;

/**
 *
 * @author Felipe Lopera
 */
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Persons")
public class PersonEntity {
    
    	@Id
	private long personId;
	private String name;
	private int age;
	private String role;
	
	public PersonEntity() {}

	public PersonEntity(long personId, String name, int age, String role) {
		super();
		this.personId = personId;
		this.name = name;
		this.age = age;
		this.role = role;
	}
    
}
