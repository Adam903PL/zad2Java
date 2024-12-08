package notification;

import user.User;

public class EmailProvider implements NotificationProvider {
    @Override
    public void send(String message, User user) {
        if (user.isEmailNotificationsOn()) {
            System.out.println("Wysyłam maila o treści: \"" + message + "\" do użytkownika "
                    + user.getLogin() + " na adres " + user.getEmail());
        }
    }
}
