
package veterinary.domain.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import veterinary.Adapters.Person.Entity.PersonEntity;

/**
 *
 * @author Felipe Lopera
 */
@Getter
@Setter
@NoArgsConstructor
public class User extends Person{
    
   private String userName;
   private String password;
   
   public User(long id, String name, int age, String role, String userName, String password){
       super(id, name, age, role);
       this.userName = userName;
       this.password = password;
   }
   
   public String getUserName(){
       return userName;
   }
   
   public void setUserName(String userName){
       this.userName = userName;
   }
   
   public String getPassword(){
       return password;
   }
   
   public void setPassword(String password){
       this.password = password;
   }

    public void setPersonId(PersonEntity personId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
}