package behaviourial.chainofresponsibility;

public interface Handler {
    void setNext(Handler handler);

    void handle(String request);
}
