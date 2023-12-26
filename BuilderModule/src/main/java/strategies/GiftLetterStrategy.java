package strategies;
import mailbox.Client;

public class GiftLetterStrategy implements LetterStrategy {
    @Override
    public void sendLetter(Client client) {
        System.out.println("Sending a gift letter to " + client.getName());
    }
}
