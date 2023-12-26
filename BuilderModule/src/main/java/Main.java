import mailbox.*;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Ivan Ivanov", 25, "Male");
        Client client2 = new Client("Petro Petrov", 30, "Male");

        MailInfo birthdayMailInfo = new MailInfo(client1, MailCodes.BIRTHDAY);
        MailInfo giftMailInfo = new MailInfo(client2, MailCodes.GIFT);
        MailInfo holidayMailInfo = new MailInfo(client1, MailCodes.HOLIDAY);

        MailBox mailBox = new MailBox();
        mailBox.addMailInfo(birthdayMailInfo);
        mailBox.addMailInfo(giftMailInfo);
        mailBox.addMailInfo(holidayMailInfo);

        mailBox.sendAll();
    }
}
