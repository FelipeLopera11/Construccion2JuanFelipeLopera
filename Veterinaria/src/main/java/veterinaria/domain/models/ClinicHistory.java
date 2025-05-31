
package veterinaria.domain.models;

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

public class ClinicHistory {
    
    private long date;
    private User veterinarian;
    private Pet pet;
    private String reason;
    private String procedure;
    private double dose;
    private String allergy;
    private String syntomps;
    private String diagnosis;
    private String medicine;
    private MedicalOrder orderId;
    private String vaccinationHistory;
    private String detailProcedure;
    
    public ClinicHistory(long date, User veterinarian, Pet pet, String reason, String procedure, double dose, String allergy, String syntomps, String diagnosis,
            String medicine, MedicalOrder orderId, String vaccinationHistory, String detailProcedure) {
        this.date = date;
        this.veterinarian = veterinarian;
        this.pet = pet;
        this.reason = reason;
        this.procedure = procedure;
        this.dose = dose;
        this.allergy = allergy;
        this.syntomps = syntomps;
        this.diagnosis = diagnosis;
        this.medicine = medicine;
        this.orderId = orderId;
        this.vaccinationHistory = vaccinationHistory;
        this.detailProcedure = detailProcedure;
    } 
    
    public long getDate(){
        return date;
    }
    public void setDate(long date){
        this.date = date;
    }
    
    public User getVeterinarian(){
        return veterinarian;
    }
    public void setVeterinarian(User veterinarian){
        this.veterinarian = veterinarian;
    }
    
    public Pet getPet(){
        return pet;
    }
    public void setPet(Pet pet){
        this.pet = pet;
    }
    
    public String getReason(){
        return reason;
    }
    public void setReason(String reason){
        this.reason = reason;
    }
    
    public String getProcedure(){
        return procedure;
    }
    public void setProcedure(String procedure){
        this.procedure = procedure;
    }
    
    public double getDose(){
        return dose;
    }
    public void setDose(double dose){
        this.dose = dose;
    }
    
    public String getAllergy(){
        return allergy;
    }
    public void setAllergy(String allergy){
        this.allergy = allergy;
    }
    
      public String getSyntomps() {
        return syntomps;
    }

    public void setSyntomps(String syntomps) {
        this.syntomps = syntomps;
    }
    
     public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
    
     public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }
    
    
    public MedicalOrder getOrderId() {
        return orderId;
    }

    public void setOrderId(MedicalOrder orderId) {
        this.orderId = orderId;
    }

    public String getVaccinationHistory() {
        return vaccinationHistory;
    }

    public void setVaccinationHistory(String vaccinationHistory) {
        this.vaccinationHistory = vaccinationHistory;
    }
    
    public String getDetailProcedure() {
        return detailProcedure;
    }

    public void setDetailProcedure(String detailProcedure) {
        this.detailProcedure = detailProcedure;
    }


}
