package hu.progmasters;

@FunctionalInterface
public interface EmailSenderWithParam {
    String email = "asd";

    void send(String email);

    default void reSend() {
        System.out.println("default");
    }

    static void notSend() {
        System.out.println("static");
    }
}
