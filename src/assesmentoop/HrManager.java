
package assesmentoop;


public class HrManager extends User {
    private String password;

    public HrManager() {
    }

    public HrManager(String password, int epfno, String username) {
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

