
package assesmentoop;


public class HrAssistant extends User {
    private String password;

    public HrAssistant() {
    }

    public HrAssistant(String password, int epfno, String username) {
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
