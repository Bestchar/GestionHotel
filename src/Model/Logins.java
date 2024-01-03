
package Model;

/**
 *
 * @author charles_4545
 */
public class Logins {
    private String username;
    private int pass;
    public Logins() {
    
    }

    public Logins(String username, int pass) {
        this.username = username;
        this.pass = pass;
    }

    public String getUsername() {
        return username;
    }

    public int getPass() {
        return pass;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }
    
    
}
    
