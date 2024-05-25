public class PremiumUser extends User{

    public PremiumUser(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String message) {
        System.out.println(name + "sends: " + message);
    }

    @Override
    public void receive(String message) {
        System.out.println(name + "receives: " + message);
    }
}
