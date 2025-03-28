
package veterinary.domain.models;

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

public class Invoice {
    
    private long invoiceId;
	private Pet pet;
        private Person id;
	private MedicalOrder medicalOrder;
	private String productName;
	private double price;
	private int quantity;
	private Date date;
	
	public Invoice(long invoiceId, Pet pet, Person id, MedicalOrder medicalOrder, String productName, double price, int quantity,
			Date date) {
		super();
		this.invoiceId = invoiceId;
		this.pet = pet;
                this.id = id;
		this.medicalOrder = medicalOrder;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		this.date = date;
	}
        
        public long getInoviceId(){
            return invoiceId;
        }
        public void setInovidId(long invoiceId){
            this.invoiceId = invoiceId;
        }
        
        public Pet getPet(){
            return pet;
        }
        public void setPet(Pet pet){
            this.pet = pet;
        }
        
        public Person getId(){
            return id;
        }
        public void setId(Person id){
            this.id = id;
        }
        
        public MedicalOrder getMedicalOrder(){
            return  medicalOrder;
        }
        public void setMedicalOrder(MedicalOrder medicalOrder){
            this.medicalOrder = medicalOrder;
        }
        
        public String getProductName(){
            return productName;
        }
        public void setProductName(String productName){
            this.productName = productName;
        }
        
        public double getPrice(){
            return price;
        }
        public void setPrice(double price){
            this.price = price;
        }
        
        public int getQuantity(){
            return quantity;
        }
        public void setQuantity(int quantity){
            this.quantity = quantity;
        }
        
        public Date getDate(){
            return date;
        }
        public void setDate(Date date){
            this.date = date;  
        }
              

}
