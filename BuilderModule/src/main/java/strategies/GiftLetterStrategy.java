package strategies;
import lombok.Getter;
import mailbox.Client;

public class GiftLetterStrategy implements LetterStrategy {
    @Getter
    boolean sentSuccessful = false;

    @Override
    public void sendLetter(Client client) {
        sentSuccessful = true;
        System.out.println("Sending a gift letter to " + client.getName());
    }
}
