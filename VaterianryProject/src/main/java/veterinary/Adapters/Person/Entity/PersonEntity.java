package veterinary.Adapters.Person.Entity;

/**
 *
 * @author Felipe Lopera
 */
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "person")
@Getter
@Setter
@NoArgsConstructor
public class PersonEntity {
    
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private int age;
    @Column(name = "role")
    private String role;
    
    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    
    public String getRole(){
        return role;
    }
    public void setRole(String role){
        this.role = role;
    }

}





