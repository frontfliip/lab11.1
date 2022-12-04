package task2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import task2.stratagies.MailCode;

@AllArgsConstructor
@Getter
public class MailInfo {
    private Client client;
    private MailCode mailCode;
    public String generate() {
        return mailCode.generate(client);
    }
}
