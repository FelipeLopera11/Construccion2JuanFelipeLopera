
package veterinary.Adapters.ClinicHistory;

/**
 *
 * @author Felipe Lopera
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import veterinary.Adapters.ClinicHistory.Entity.ClinicHistoryEntity;
import veterinary.Adapters.ClinicHistory.Repository.ClinicHistoryRepository;
import veterinary.domain.models.ClinicHistory;
import veterinary.domain.models.Pet;
import veterinary.domain.ports.ClinicHistoryPort;

public class ClinicHistoryAdapter implements ClinicHistoryPort{
    
    @Autowired
	private ClinicHistoryRepository historyRepository;
	
	@Override
	public ClinicHistory getClinicHistory(Pet pet) {
		return historyRepository.findByPet(pet);
	}

	@Override
	public void saveClinicHistory(ClinicHistory clinicHistory) {
		historyRepository.save(new ClinicHistoryEntity(clinicHistory.getPet(), clinicHistory.getRecords()));
	}

	
}
