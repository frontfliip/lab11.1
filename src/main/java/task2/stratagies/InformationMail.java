package task2.stratagies;

import task2.Client;
import task2.stratagies.MailCode;

public class InformationMail implements MailCode {

    private static String TEMPLATE = "Dear %NAME, congrats on becoming a part Silpo company. You can start working on Monday";

    private static String SUBJECT = "Job info";

    @Override
    public String generate(Client client) {
        return TEMPLATE.replaceAll("%NAME", client.getName());
    }
    @Override
    public String getSubject() {
        return SUBJECT;
    }
}
