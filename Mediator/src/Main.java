public class Main {
    public static void main(String[] args) {

        Mediator chat = new Chat();
        User user1 = new BasicUser(chat,"User1");
        User user2 = new BasicUser(chat,"User2");
        User user3 = new PremiumUser(chat,"User3");

        chat.addUser(user1);
        chat.addUser(user2);
        chat.addUser(user3);

        user1.send("Hi");
        user2.send("hello");
        user3.send("tontos jaja");



    }
}