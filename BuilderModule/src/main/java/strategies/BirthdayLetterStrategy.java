package strategies;
import lombok.Getter;
import mailbox.Client;


public class BirthdayLetterStrategy implements LetterStrategy {
    @Getter
    boolean sentSuccessful = false;
    @Override
    public void sendLetter(Client client) {
        sentSuccessful = true;
        System.out.println("Sending birthday letter to " + client.getName());
    }
}
