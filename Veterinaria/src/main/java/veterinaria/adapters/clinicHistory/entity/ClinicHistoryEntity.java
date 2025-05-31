
package veterinaria.adapters.clinicHistory.entity;

/**
 *
 * @author Felipe Lopera
 */

import veterinaria.adapters.pet.entity.PetEntity;
import veterinaria.adapters.Users.entity.UserEntity;
import veterinaria.adapters.medicalOrder.entity.MedicalOrderEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "clinichistory")
public class ClinicHistoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "date", nullable = false)
    private long date;

    @ManyToOne
    @JoinColumn(name = "veterinarian_id", nullable = false)
    private UserEntity veterinarian;

    @ManyToOne
    @JoinColumn(name = "pet_id", nullable = false)
    private PetEntity petId;

    @Column(name = "reason", nullable = false)
    private String reason;

    @Column(name = "procedure", nullable = false)
    private String procedure;

    @Column(name = "dose", nullable = false)
    private double dose;

    @Column(name = "allergy")
    private String allergy;

    @Column(name = "symptoms")
    private String symptoms;

    @Column(name = "diagnosis")
    private String diagnosis;

    @Column(name = "medicine")
    private String medicine;

    @OneToOne
    @JoinColumn(name = "medical_order_id")
    private MedicalOrderEntity orderId;

    @Column(name = "vaccination_history")
    private String vaccinationHistory;

    @Column(name = "detail_procedure")
    private String detailProcedure;


    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id= id;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public UserEntity getVeterinarian() {
        return veterinarian;
    }

    public void setVeterinarian(UserEntity veterinarian) {
        this.veterinarian = veterinarian;
    }

    public PetEntity getPetId() {
        return petId;
    }

    public void setPetId(PetEntity petId) {
        this.petId = petId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getProcedure() {
        return procedure;
    }

    public void setProcedure(String procedure) {
        this.procedure = procedure;
    }

    public double getDose() {
        return dose;
    }

    public void setDose(double dose) {
        this.dose = dose;
    }

    public String getAllergy() {
        return allergy;
    }

    public void setAllergy(String allergy) {
        this.allergy = allergy;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
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

    public MedicalOrderEntity getOrderId() {
        return orderId;
    }

    public void setOrderId(MedicalOrderEntity orderId) {
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


