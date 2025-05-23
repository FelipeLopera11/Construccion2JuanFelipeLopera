package veterinary.Adapters.Pet.Entity;

/**
 *
 * @author Felipe Lopera
 */
import veterinary.domain.models.Person;
import veterinary.Adapters.Person.Entity.PersonEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name ="pets")
@Getter
@Setter
public class PetEntity {

    @Id
    @Column(name = "pet_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long petId;

    @Column(name = "pet_name", nullable = false)
    private String name;

    @Column(name = "pet_age", nullable = false)
    private int age;

    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    private PersonEntity owner;

    @Column(name = "specie", nullable = false)
    private String specie;
    
     @Column(name = "race", nullable = false)
    private String race;

    @Column(name = "characteristics")
    private String characteristics;

    @Column(name = "weight", nullable = false)
    private double weight;

    public PetEntity() {}

    public long getPetId() {
        return petId;
    }

    public void setPetId(long petId) {
        this.petId = petId;
    }

    public String getName() {
        return name;
    }

    public void setPetName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setPetAge(int age) {
        this.age = age;
    }

    public PersonEntity getOwner() {
        return owner;
    }

    public void setOwner(PersonEntity owner) {
        this.owner = owner;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }
    
    public String getRace(){
        return race;
    }
    
    public void setRace(String race){
        this.race = race;
    }

    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}





