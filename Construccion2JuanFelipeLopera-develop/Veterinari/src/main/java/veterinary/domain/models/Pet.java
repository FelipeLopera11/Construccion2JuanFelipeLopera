
package veterinary.domain.models;

/**
 *
 * @author Felipe Lopera
 */

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class Pet {
    
    
	private String petName;
	private int petAge;
	private Person owner;
	private long petId;
	private String specie;
	private String characteristics;
	private long weight;
	
	public Pet(String petName, int petAge, Person owner, long petId, String specie, String characteristics,
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
