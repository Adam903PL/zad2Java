package notification;

import user.User;

public class NotificationService {
    private NotificationProvider[] providers;

    public NotificationService()     {
        providers = new NotificationProvider[2];
        providers[0] = new EmailProvider();
        providers[1] = new SMSProvider();
    }


    public void notify(String message, User user) {
        for (NotificationProvider provider : providers) {
            provider.send(message, user);
        }
    }
}
