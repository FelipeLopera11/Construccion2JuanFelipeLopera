
package veterinary.domain.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter 
@Getter 
@NoArgsConstructor

public class Person {
    private long id;
    private String name;
    private int age;
    private String role;
   
    
    public Person(long id, String name, int age, String role ){
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.role = role;
    }
            
}
