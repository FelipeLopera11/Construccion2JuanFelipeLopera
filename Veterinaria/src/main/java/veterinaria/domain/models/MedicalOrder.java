
package veterinaria.domain.models;

/**
 *
 * @author Felipe Lopera
 */

import java.sql.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class MedicalOrder {
    
    private long orderId;
    private Pet pet;
    private Person person;
    private User veterinarian;
    private String medicationName;
    private double dosage;
    private Date date;
	
    public MedicalOrder(long orderId, Pet pet, Person person, User veterinarian, String medicationName, double dosage,
        Date date) {
        super();
        this.orderId = orderId;
        this.pet = pet;
        this.person = person;
        this.veterinarian = veterinarian;
        this.medicationName = medicationName;
        this.dosage = dosage;this.date = date;
	}
        
        public long getOrderId(){
            return orderId;
        }
        public void setOrderId(long id){
            this.orderId = orderId;
        }
        
        public Pet getPet(){
            return pet;
        }
        public void setPet(Pet pet){
            this.pet = pet;
        }
        
        public Person getPerson(){
            return person;
        }
        public void setPerson(Person person){
            this.person = person;
        }
        
        public User getVeterinarian(){
            return veterinarian;
        }
        public void setVeterinarian(User veterinarian){
            this.veterinarian = veterinarian;
        }
        
        public String getMedicationName(){
            return medicationName;
        }
        public void setMedicationName(String medicationName){
            this.medicationName = medicationName;
        }
        
        public double getDosage(){
            return dosage;
        }
        public void setDosage(double dosage){
            this.dosage = dosage;
        }
        
        public Date getDate(){
            return date;
        }
        public void setDate(Date date){
            this.date = date;
        }

}

