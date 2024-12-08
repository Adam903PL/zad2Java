import notification.NotificationService;
import user.User;

public class Main {
    public static void main(String[] args) {

        User user = new User("user123", "user@mail.com", "123456789", true, true);

        NotificationService notificationService = new NotificationService();

        notificationService.notify("Cześć", user);
    }
}
