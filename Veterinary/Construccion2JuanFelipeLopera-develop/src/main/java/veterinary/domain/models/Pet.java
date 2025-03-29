
package veterinary.domain.models;

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

public class Pet {
    
    private long petId;
    private String name;
    private Person id;
    private int age;
    private String spice;
    private String race;
    private String characteristics;
    private double weight;

    public Pet(long petId, String name, Person id, int age, String spice, String race, String characteristics, double weight) {
        this.petId = petId;
        this.name = name;
        this.id = id;
        this.age = age;
        this.spice = spice;
        this.race = race;
        this.characteristics = characteristics;
        this.weight = weight;
    }

    public long getPetId() {
        return petId;
    }

    public void setPetId(long PetId) {
        this.petId = petId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getId() {
        return id;
    }

    public void setDocument(Person id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpice() {
        return spice;
    }

    public void setSpice(String spice) {
        this.spice = spice;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
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