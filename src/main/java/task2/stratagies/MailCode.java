package task2.stratagies;

import task2.Client;

public interface MailCode {

    String generate(Client client);
    String getSubject();
}
