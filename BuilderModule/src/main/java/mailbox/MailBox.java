package mailbox;

import strategies.BirthdayLetterStrategy;
import strategies.GiftLetterStrategy;
import strategies.HolidayLetterStrategy;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private List<MailInfo> infos = new ArrayList<>();

    public void addMailInfo(MailInfo mailInfo) {
        infos.add(mailInfo);
    }

    public void sendAll() {
        for (MailInfo mailInfo : infos) {
            MailSender sender = new MailSender();
            switch (mailInfo.getMailCode()) {
                case HOLIDAY -> sender.sendLetter(mailInfo, new HolidayLetterStrategy());
                case GIFT -> sender.sendLetter(mailInfo, new GiftLetterStrategy());
                case BIRTHDAY -> sender.sendLetter(mailInfo, new BirthdayLetterStrategy());
            }
        }
        infos.clear();
    }
}
