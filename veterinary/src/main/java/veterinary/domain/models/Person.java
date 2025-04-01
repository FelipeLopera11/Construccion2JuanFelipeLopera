
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
    
    public Person(long id, String name, int age, String role){
        this.id = id;
        this.name = name;
        this.age = age;
        this.role = role;
    }
    
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
