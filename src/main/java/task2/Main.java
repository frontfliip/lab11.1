package task2;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import task2.stratagies.InformationMail;
import task2.stratagies.MailCode;
import task2.stratagies.SaleMail;

import static task2.Gender.HELICOPTER;
import static task2.Gender.MALE;

public class Main {
    private static final Client client1 = new Client("Ivan", HELICOPTER, 19, "ivan.nikolaichenko@ucu.edu.ua");
    private static final Client client2 = new Client("Liubomir", MALE, 18, "liubomyr.mokrytskyi@ucu.edu.ua");
    private static final MailCode informationMail = new InformationMail();
    private static final MailCode saleMale = new SaleMail();


    public static void main(String[] args) throws MailjetException, MailjetSocketTimeoutException {
        MailBox mailBox = new MailBox();
        mailBox.addMainInfo( new MailInfo(client1, informationMail));
        mailBox.addMainInfo( new MailInfo(client2, saleMale));
        mailBox.sendAll();
    }
}
