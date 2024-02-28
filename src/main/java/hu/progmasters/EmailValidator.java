package hu.progmasters;

import java.util.function.Predicate;

public class EmailValidator implements Predicate<String> {
    @Override
    public boolean test(String email) {
        return email.contains("@");
    }
}
