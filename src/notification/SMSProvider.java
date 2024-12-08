package notification;

import user.User;

public class SMSProvider implements NotificationProvider {
    @Override
    public void send(String message, User user) {
        if (user.isSMSNotificationsOn()) {
            System.out.println("Wysyłam SMS o treści: \"" + message + "\" do użytkownika "
                    + user.getLogin() + " na numer " + user.getPhoneNumber());
        }
    }
}
