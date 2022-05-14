package behaviourial.chainofresponsibility;

public class BaseHandler implements Handler {
    protected Handler next;

    @Override
    public void setNext(Handler handler) {
        this.next = handler;
    }

    @Override
    public void handle(String request) {
        System.out.println("Default handling");
    }
}
