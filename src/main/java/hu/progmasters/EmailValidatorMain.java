package hu.progmasters;

import java.util.List;

public class EmailValidatorMain {
    public static void main(String[] args) {
        EmailValidator emailValidator = new EmailValidator();

        List<String> emails = List.of("hello@gmail.com", "hellogmail.com");

        emails.forEach(e -> {
            boolean test = emailValidator.test(e);
            System.out.println(test);
        });
    }
}
