package mailbox;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor @Getter
public class MailInfo {
    private final Client client;
    private final MailCodes mailCode;
}
