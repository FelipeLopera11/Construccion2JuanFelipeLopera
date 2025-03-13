
package veterinary.domain.models;

/**
 *
 * @author Felipe Lopera
 */
import java.sql.Date;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class MedicalRecord {
    
    private Date date;
    private String tratingVet;
    private String reasonCon;
    private String symptoms;	
    private String diagnosis;
    private String procedure;
    private String medication;
    private String dosage;
    private long orderId;
    private String vaccinationHistory;
    private String allergies;
    private String procedureDetails;
        
        public MedicalRecord(Date date, String tratingVet, String reasonCon, String symptoms, String diagnosis,
			String procedure, String medication, String dosage, long orderId, String vaccinationHistory,
			String allergies, String procedureDetails) {
		super();
		this.date = date;
		this.tratingVet = tratingVet;
		this.reasonCon = reasonCon;
		this.symptoms = symptoms;
		this.diagnosis = diagnosis;
		this.procedure = procedure;
		this.medication = medication;
		this.dosage = dosage;
		this.orderId = orderId;
		this.vaccinationHistory = vaccinationHistory;
		this.allergies = allergies;
		this.procedureDetails = procedureDetails;
	}

}
