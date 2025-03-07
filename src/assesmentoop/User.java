
package assesmentoop;

public class User {
    private  int epfno;
    private String username;

    public User() {
    }

    public User(int epfno, String username) {
        this.epfno = epfno;
        this.username = username;
    }

    public int getEpfno() {
        return epfno;
    }

    public void setEpfno(int epfno) {
        this.epfno = epfno;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

