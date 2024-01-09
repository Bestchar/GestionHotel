
package Model;

/**
 *
 * @author charles_4545
 */
public class LoginM {
    private String Username;
    private String Pass;
    public LoginM(){
        
    }

    public LoginM(String Username, String Pass) {
        this.Username = Username;
        this.Pass = Pass;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }
    
}
