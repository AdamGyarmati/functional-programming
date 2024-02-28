package hu.progmasters;

public class Hotmail implements EmailSender {
    @Override
    public void send() {
        System.out.println("Send email with hotmail...");
    }
}
