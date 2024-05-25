public class WhatsappFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new WhatsappNotification();
    }
}
