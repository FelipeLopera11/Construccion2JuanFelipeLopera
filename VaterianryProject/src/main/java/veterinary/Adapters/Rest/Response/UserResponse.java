
package veterinary.Adapters.Rest.Response;

/**
 *
 * @author Felipe Lopera
 */
public class UserResponse {
    
    private String name;
    private String userName;
    private String role;

    
    public String getName(){
        return this.name;
    }
    
    public String getUserName(){
        return this.userName;
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
    
    public void setRole(String role){
        this.role = role;
    }
    
}