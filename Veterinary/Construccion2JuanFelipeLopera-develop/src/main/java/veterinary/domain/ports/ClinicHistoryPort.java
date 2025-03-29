
package veterinary.domain.ports;

/**
 *
 * @author Felipe Lopera
 */

import veterinary.domain.models.ClinicHistory;
import veterinary.domain.models.Pet;

public interface ClinicHistoryPort {
    
    public void saveClinicHistory(ClinicHistory clinicHistory);
    public void clinicHistoryVisualizer(ClinicHistory clinicalHistory);
    
}
