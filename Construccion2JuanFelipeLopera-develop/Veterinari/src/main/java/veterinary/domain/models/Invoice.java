
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
    
    private String invoiceId;
	private Pet pet;
	private MedicalOrder medicalOrder;
	private String productName;
	private double price;
	private int quantity;
	private Date invoiceDate;
	
	public Invoice(String invoiceId, Pet pet, MedicalOrder medicalOrder, String productName, double price, int quantity,
			Date invoiceDate) {
		super();
		this.invoiceId = invoiceId;
		this.pet = pet;
		this.medicalOrder = medicalOrder;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		this.invoiceDate = invoiceDate;
	}

}
