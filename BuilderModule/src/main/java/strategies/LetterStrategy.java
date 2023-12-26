package strategies;
import lombok.Getter;
import mailbox.*;

public interface LetterStrategy {
    void sendLetter(Client client);
}
