
package veterinaria.adapters.medicalOrder.entity;

/**
 *
 * @author Felipe Lopera
 */

import veterinaria.adapters.pet.entity.PetEntity;
import veterinaria.adapters.Persons.entity.PersonEntity;
import veterinaria.adapters.Users.entity.UserEntity;
import jakarta.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "medicalorder")
public class MedicalOrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private long orderId;

    @ManyToOne
    @JoinColumn(name = "pet_id", nullable = false)
    private PetEntity petId;

    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    private PersonEntity id;

    @ManyToOne
    @JoinColumn(name = "veterinarian_id", nullable = false)
    private UserEntity veterinarian;

    @Column(name = "medication_name", nullable = false)
    private String medicationName;

    @Column(name = "dosage", nullable = false)
    private double dosage;

    @Column(name = "date", nullable = false)
    private Date date;

    public MedicalOrderEntity() {}

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public PetEntity getPetId() {
        return petId;
    }

    public void setPetId(PetEntity petId) {
        this.petId = petId;
    }

    public PersonEntity getId() {
        return id;
    }

    public void setId(PersonEntity id) {
        this.id = id;
    }

    public UserEntity getVeterinarian() {
        return veterinarian;
    }

    public void setVeterinarian(UserEntity veterinarian) {
        this.veterinarian = veterinarian;
    }

    public String getMedicationName() {
        return medicationName;
    }

    public void setMedicationName(String medicationName) {
        this.medicationName = medicationName;
    }

    public double getDosage() {
        return dosage;
    }

    public void setDosage(double dosage) {
        this.dosage = dosage;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
