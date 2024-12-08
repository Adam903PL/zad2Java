package notification;

import user.User;

public interface NotificationProvider {
    void send(String message, User user);
}
