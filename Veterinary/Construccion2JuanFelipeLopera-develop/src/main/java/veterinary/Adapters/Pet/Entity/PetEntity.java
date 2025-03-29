package veterinary.Adapters.Pet.Entity;

/**
 *
 * @author Felipe Lopera
 */
import veterinary.domain.models.Person;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="pets")
public class PetEntity {
    
    
	@Id
	private long petId;
	private String petName;
	private int petAge;
	private Person owner;
	private String specie;
	private String characteristics;
	private long weight;
	
	public PetEntity() {}

	public PetEntity(String petName, int petAge, Person owner, long petId, String specie, String characteristics,
			long weight) {
		super();
		this.petName = petName;
		this.petAge = petAge;
		this.owner = owner;
		this.petId = petId;
		this.specie = specie;
		this.characteristics = characteristics;
		this.weight = weight;
	}
}


