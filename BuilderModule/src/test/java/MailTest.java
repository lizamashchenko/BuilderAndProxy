import org.junit.Test;
import strategies.*;
import mailbox.*;

import static org.junit.Assert.assertTrue;

public class MailTest {

    @Test
    public void testSendBirthdayLetter() {
        Client client = new Client("Liza Mashchenko", 25, "Female");
        MailInfo mailInfo = new MailInfo(client, MailCodes.BIRTHDAY);

        BirthdayLetterStrategy birthdayStrategy = new BirthdayLetterStrategy();
        MailSender.sendLetter(mailInfo, birthdayStrategy);

        assertTrue(birthdayStrategy.isSentSuccessful());
    }

    @Test
    public void testSendGiftLetter() {
        Client client = new Client("Ivan Ivanov", 30, "Male");
        MailInfo mailInfo = new MailInfo(client, MailCodes.GIFT);

        GiftLetterStrategy giftStrategy = new GiftLetterStrategy();
        MailSender.sendLetter(mailInfo, giftStrategy);

        assertTrue(giftStrategy.isSentSuccessful());
    }

    @Test
    public void testSendHolidayLetter() {
        Client client = new Client("Petro Petrov", 35, "Male");
        MailInfo mailInfo = new MailInfo(client, MailCodes.HOLIDAY);

        HolidayLetterStrategy holidayStrategy = new HolidayLetterStrategy();
        MailSender.sendLetter(mailInfo, holidayStrategy);

        assertTrue(holidayStrategy.isSentSuccessful());
    }
}
