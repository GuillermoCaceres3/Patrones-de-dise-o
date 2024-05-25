public class SMSNotification implements Notification{
    @Override
    public void send() {
        System.out.println("Enviando una notificacion por sms");
    }
}
