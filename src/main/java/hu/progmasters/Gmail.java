package hu.progmasters;

public class Gmail implements EmailSender {
    @Override
    public void send() {
        System.out.println("Send email with gmail...");
    }
}
