package mailbox;

import lombok.Getter;

@Getter
public class Client {
    private static int idCounter = 0;

    private final int id;
    private final String name;
    private final int age;
    private final String sex;

    public Client(String name, int age, String sex) {
        this.id = idCounter++;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}

