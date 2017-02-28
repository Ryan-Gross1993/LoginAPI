package zcw.rgross;

/**
 * Created by ryan on 2/28/17.
 */
public class Login {

    private static String userName = "Daddy-X";
    private static String password = "KMK";
    private String actualName;
    private String actualPassword;

    public void setActualName(String actualName) {
        this.actualName = actualName;
    }

    public void setActualPassword(String actualPassword) {
        this.actualPassword = actualPassword;
    }

    public String getActualName() {
        return actualName;
    }

    public String getActualPassword() {
        return actualPassword;
    }

    public static String getUserName() {
        return userName;
    }

    public static String getPassword() {
        return password;
    }

    public boolean isLegit() {
        if (getUserName().equals(getActualName()) && getPassword().equals(getActualPassword()) ) {
            return true;
        } else {
            return false;
        }
    }

    public Login(String username, String password) {
      this.actualName = username;
      this.actualPassword = password;
    }
}

