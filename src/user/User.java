package user;

public class User {
    private String login;
    private String email;
    private String phoneNumber;
    private boolean isEmailNotificationsOn;
    private boolean isSMSNotificationsOn;


    public User(String login, String email, String phoneNumber, boolean isEmailOn, boolean isSMSOn) {
        this.login = login;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.isEmailNotificationsOn = isEmailOn;
        this.isSMSNotificationsOn = isSMSOn;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isEmailNotificationsOn() {
        return isEmailNotificationsOn;
    }

    public void setEmailNotificationsOn(boolean emailNotificationsOn) {
        isEmailNotificationsOn = emailNotificationsOn;
    }

    public boolean isSMSNotificationsOn() {
        return isSMSNotificationsOn;
    }

    public void setSMSNotificationsOn(boolean SMSNotificationsOn) {
        isSMSNotificationsOn = SMSNotificationsOn;
    }
}
