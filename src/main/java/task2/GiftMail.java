package task2;

public class GiftMail implements MailCode{
    private static String TENPLATE = "BLACK FRIDAY! %NAME, YOU CAN RECEIVE YOUR DISCOUNT NOW";

    @Override
    public String generate(Client client){
        return TENPLATE.replaceAll("%NAME", client.getName());

    }
}
