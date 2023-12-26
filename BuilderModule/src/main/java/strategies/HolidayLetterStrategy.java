package strategies;

import mailbox.Client;

public class HolidayLetterStrategy implements LetterStrategy {
    @Override
    public void sendLetter(Client client) {
        System.out.println("Sending a holiday letter to " + client.getName());
    }
}
