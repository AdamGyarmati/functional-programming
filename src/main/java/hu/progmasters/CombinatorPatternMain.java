package hu.progmasters;

public class CombinatorPatternMain {
    public static void main(String[] args) {
        Person a = new Person("A", "+0000000", "p@gmail.com");
        Person b = new Person("B", "+0000000", "p@gmail.com");

        PersonRegistrationValidator validator = PersonRegistrationValidator
                .isEmailTaken()
                .and(PersonRegistrationValidator.isEmailValid())
                .and(PersonRegistrationValidator.isPhoneNumberValid());

        System.out.println(validator.apply(a));
        System.out.println(validator.apply(b));
    }
}
