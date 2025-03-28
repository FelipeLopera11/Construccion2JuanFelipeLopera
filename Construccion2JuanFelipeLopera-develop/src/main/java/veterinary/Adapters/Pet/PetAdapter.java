package veterinary.Adapters.Pet;

/**
 *
 * @author Felipe Lopera
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import veterinary.Adapters.Pet.Entity.PetEntity;
import veterinary.Adapters.Pet.Repository.PetRepository;
import veterinary.domain.models.Pet;
import veterinary.domain.ports.PetPort;

@Service
public class PetAdapter implements PetPort{
    
    @Autowired
	private PetRepository petRepository;
	
	@Override
	public boolean petExists(long petId) {
		return petRepository.existsById(petId);
	}

	@Override
	public Pet getPetById(long petId) {
	//	Optional<PetEntity> entity = petRepository.findById(petId);
		return null;
	}

	@Override
	public void savePet(Pet pet) {
		PetEntity entity = new PetEntity(pet.getPetName(), pet.getPetAge(), pet.getOwner(), pet.getPetId(), pet.getSpecie(), pet.getCharacteristics(), pet.getWeight());
		petRepository.save(entity);
		
	}
}
