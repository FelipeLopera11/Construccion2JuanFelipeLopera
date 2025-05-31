
package veterinaria.Ports;

/**
 *
 * @author Felipe Lopera
 */

import veterinaria.domain.models.ClinicHistory;
import veterinaria.domain.models.Pet;

public interface ClinicHistoryPort {
    
    public void saveClinicHistory(ClinicHistory clinicHistory);
    public void clinicHistoryVisualizer(ClinicHistory clinicalHistory);
    
}
