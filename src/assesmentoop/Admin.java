
package assesmentoop;

public class Admin extends User {
    private String password;

    public Admin() {
    }

    public Admin(String password, int epfno, String username) {
        super(epfno, username);
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    
    
}
