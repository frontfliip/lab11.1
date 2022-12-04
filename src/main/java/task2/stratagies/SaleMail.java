package task2.stratagies;

import task2.Client;
import task2.stratagies.MailCode;

public class SaleMail implements MailCode {
    private static String TEMPLATE = "Black Friday! %NAME, YOU CAN RECEIVE YOUR DISCOUNT NOW";

    private static String SUBJECT = "BLACK FRIDAY";

    @Override
    public String generate(Client client){
        return TEMPLATE.replaceAll("%NAME", client.getName());
    }

    @Override
    public String getSubject() {
        return SUBJECT;
    }
}
