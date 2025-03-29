package veterinary.Adapters.Invoice.Entity;

/**
 *
 * @author Felipe Lopera
 */
import veterinary.Adapters.Pet.Entity.PetEntity;
import veterinary.Adapters.Person.Entity.PersonEntity;
import veterinary.Adapters.MedicalOrder.Entity.MedicalOrderEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.sql.Date;

@Entity
@Table(name = "invoices")
@Getter
@Setter
public class InvoiceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "invoice_id")
    private long invoiceId;

    @ManyToOne
    @JoinColumn(name = "pet_id", nullable = false)
    private PetEntity petId;

    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    private PersonEntity id;

    @OneToOne
    @JoinColumn(name = "medical_order_id", nullable = true)
    private MedicalOrderEntity orderId;

    @Column(name = "product_name", nullable = false)
    private String productName;

    @Column(name = "price", nullable = false)
    private double price;

    @Column(name = "quantity", nullable = false)
    private int quantity;

    @Column(name = "date", nullable = false)
    private Date date;

    public InvoiceEntity() {}

    public long getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(long invoiceId) {
        this.invoiceId = invoiceId;
    }

    public PetEntity getPetId() {
        return petId;
    }

    public void setPet(PetEntity petId) {
        this.petId = petId;
    }

    public PersonEntity getId() {
        return id;
    }

    public void setId(PersonEntity id) {
        this.id = id;
    }

    public MedicalOrderEntity getOrderId() {
        return orderId;
    }

    public void setOrderId(MedicalOrderEntity orderId) {
        this.orderId = orderId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

