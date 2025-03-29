
package veterinary.Adapters.ClinicHistory.Entity;

/**
 *
 * @author Felipe Lopera
 */
import java.util.List;

import veterinary.Adapters.MedicalOrder.Entity.MedicalOrderEntity;
import veterinary.Adapters.Pet.Entity.PetEntity;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="clinic_histories")
public class ClinicHistoryEntity {





    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "clinic_history_id")
    private long id;

    @Column(name = "date", nullable = false)
    private long date;

    @ManyToOne
    @JoinColumn(name = "veterinarian_id", nullable = false)
    private UserEntity veterinarian;

    @ManyToOne
    @JoinColumn(name = "pet_id", nullable = false)
    private PetEntity pet;

    @Column(name = "reason", nullable = false)
    private String reason;

    @Column(name = "procedure", nullable = false)
    private String procedure;

    @Column(name = "dose")
    private double dose;

    @Column(name = "allergy")
    private String allergy;

    @Column(name = "symptoms", nullable = false)
    private String symptoms;

    @Column(name = "diagnosis", nullable = false)
    private String diagnosis;

    @Column(name = "medicine")
    private String medicine;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private MedicalOrderEntity orderId;

    @Column(name = "vaccination_history")
    private String vaccinationHistory;

    @Column(name = "detail_procedure")
    private String detailProcedure;


}
