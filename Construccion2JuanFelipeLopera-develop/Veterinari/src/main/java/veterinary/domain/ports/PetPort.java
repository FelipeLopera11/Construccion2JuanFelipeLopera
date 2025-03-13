
package veterinary.domain.ports;

/**
 *
 * @author Felipe Lopera
 */

import veterinary.domain.models.Pet;

public interface PetPort {
    
    boolean petExists(long petId);
    Pet getPetById(long petId);
    void savePet(Pet pet);
    
}
