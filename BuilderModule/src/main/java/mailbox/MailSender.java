package mailbox;

import strategies.*;

public class MailSender {
    private static final BirthdayLetterStrategy birthdayStrategy = new BirthdayLetterStrategy();
    private static final GiftLetterStrategy giftStrategy = new GiftLetterStrategy();
    private static final HolidayLetterStrategy holidayStrategy = new HolidayLetterStrategy();

    public static void sendLetter(MailInfo mailInfo, LetterStrategy strategy) {
        strategy.sendLetter(mailInfo.getClient());
//        switch (mailInfo.getMailCode()) {
//            case BIRTHDAY ->  birthdayStrategy.sendLetter(mailInfo.getClient());
//            case GIFT -> giftStrategy.sendLetter(mailInfo.getClient());
//            case HOLIDAY -> holidayStrategy.sendLetter(mailInfo.getClient());
//        }
    }
}
