
package veterinaria.Ports;

/**
 *
 * @author Felipe Lopera
 */

import veterinaria.domain.models.Pet;

public interface PetPort {
    
    public boolean ExistByPetId(Pet pet);
    public Pet findByPetId(Pet pet);
    public void savePet(Pet pet);
    
}
