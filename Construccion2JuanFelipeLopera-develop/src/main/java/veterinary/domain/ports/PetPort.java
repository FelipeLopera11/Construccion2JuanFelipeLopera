
package veterinary.domain.ports;

/**
 *
 * @author Felipe Lopera
 */

import veterinary.domain.models.Pet;

public interface PetPort {
    
    public boolean ExistByPetId(Pet pet);
    public Pet findByPetId(Pet pet);
    public void savePet(Pet pet);
    
}
