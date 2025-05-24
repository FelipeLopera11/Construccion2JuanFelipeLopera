
package veterinary.Adapters.Rest.Request;

/**
 *
 * @author Felipe Lopera
 */
public class UserRequest {
    
    private String name;
    private String userName;
    private String password;
    private String role;
   
    
    public String getName(){
        return this.name;
    }
    
    public String getUserName(){
        return this.userName;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public String getRole(){
        return this.role;
    }
    
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setUserName(String userName){
        this.userName = userName;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public void setRole(String role){
        this.role = role;
    }
  
}