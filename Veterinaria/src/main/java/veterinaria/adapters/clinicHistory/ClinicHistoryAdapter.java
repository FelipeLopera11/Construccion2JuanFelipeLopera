
package veterinaria.adapters.clinicHistory;

/**
 *
 * @author Felipe Lopera
 */

import org.springframework.stereotype.Service;
import veterinaria.adapters.clinicHistory.repository.ClinicHistoryRepository;
import veterinaria.adapters.clinicHistory.entity.ClinicHistoryEntity;
import veterinaria.adapters.pet.entity.PetEntity;
import veterinaria.adapters.Users.entity.UserEntity;
import veterinaria.adapters.medicalOrder.entity.MedicalOrderEntity;
import veterinaria.domain.models.ClinicHistory;
import veterinaria.Ports.ClinicHistoryPort;

@Service
public class ClinicHistoryAdapter implements ClinicHistoryPort {

    private final ClinicHistoryRepository clinicHistoryRepository;

    public ClinicHistoryAdapter(ClinicHistoryRepository clinicHistoryRepository) {
        this.clinicHistoryRepository = clinicHistoryRepository;
    }

    @Override
    public void saveClinicHistory(ClinicHistory clinicHistory) {
        ClinicHistoryEntity entity = new ClinicHistoryEntity();
        entity.setDate(clinicHistory.getDate());

        
        UserEntity veterinarianEntity = new UserEntity();
        veterinarianEntity.setUserId(clinicHistory.getVeterinarian().getId());
        entity.setVeterinarian(veterinarianEntity);

        
        PetEntity petEntity = new PetEntity();
        petEntity.setPetId(clinicHistory.getPet().getPetId());
        entity.setPetId(petEntity);

        entity.setReason(clinicHistory.getReason());
        entity.setProcedure(clinicHistory.getProcedure());
        entity.setDose(clinicHistory.getDose());

       
        if (clinicHistory.getOrderId() != null) {
            MedicalOrderEntity medicalOrderEntity = new MedicalOrderEntity();
            medicalOrderEntity.setOrderId(clinicHistory.getOrderId().getOrderId());
            entity.setOrderId(medicalOrderEntity);
        }

        entity.setAllergy(clinicHistory.getAllergy());
        entity.setSymptoms(clinicHistory.getSyntomps());
        entity.setDiagnosis(clinicHistory.getDiagnosis());
        entity.setMedicine(clinicHistory.getMedicine());
        entity.setVaccinationHistory(clinicHistory.getVaccinationHistory());
        entity.setDetailProcedure(clinicHistory.getDetailProcedure());

        clinicHistoryRepository.save(entity);
    }

    @Override
    public void clinicHistoryVisualizer(ClinicHistory clinicHistory) {
        
    }
}
