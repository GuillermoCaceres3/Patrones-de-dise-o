import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        NotificationFactory factory = null;
        Notification notificacion;

        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Elige el tipo de noti que quieres enviar");
            System.out.println("1. por correo");
            System.out.println("2. por sms");
            System.out.println("3. por whatsapp");
            System.out.println("4. para salir");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    factory = new EmailFactory();
                    notificacion = factory.createNotification();
                    notificacion.send();
                    break;
                case 2:
                    factory = new SMSFactory();
                    notificacion = factory.createNotification();
                    notificacion.send();
                    break;
                case 3:
                    factory = new WhatsappFactory();
                    notificacion = factory.createNotification();
                    notificacion.send();
                    break;
            }
        } while(opcion != 4);





    }
}