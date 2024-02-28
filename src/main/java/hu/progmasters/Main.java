package hu.progmasters;

public class Main {
    public static void main(String[] args) {
        EmailSender hotmail = new Hotmail();
        EmailSender gmail = new Gmail();
//        hotmail.send();
//        gmail.send();

        EmailSender emailSender = new EmailSender() {
            @Override
            public void send() {
                System.out.println("Send email...");
            }
        };

        emailSender.send();

        EmailSender emailSenderWithLambda = () -> System.out.println("Send email...");

        emailSenderWithLambda.send();

        EmailSenderWithParam emailSenderWithParam = email -> System.out.println(email);

        emailSenderWithParam.send("example@gmail.com");

        EmailSenderWithParam emailSenderWithParam1 = email -> {
            if (email.contains("@")) {
                System.out.println(email);
            } else {
                System.out.println("Invalid email");
            }
        };

        emailSenderWithParam1.send("examplegmail.com");
    }
}