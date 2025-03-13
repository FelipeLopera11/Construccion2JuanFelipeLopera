
package veterinary.domain.ports;

/**
 *
 * @author Felipe Lopera
 */

import veterinary.domain.models.ClinicHistory;
import veterinary.domain.models.Pet;

public interface ClinicHistoryPort {
    
    ClinicHistory getClinicHistory(Pet pet);
    void saveClinicHistory(ClinicHistory clinicHistory);
    
}
