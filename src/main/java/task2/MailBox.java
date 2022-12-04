package task2;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private List<MailInfo> infos = new ArrayList<>();

    public void addMainInfo(MailInfo mailInfo){infos.add(mailInfo);}

    public void sendAll() throws MailjetException, MailjetSocketTimeoutException {
        for (int i = 0; i < infos.size(); i++) {
            MailSender.sendMail(infos.get(i));
        }
    }
}
