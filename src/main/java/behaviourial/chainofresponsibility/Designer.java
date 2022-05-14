package behaviourial.chainofresponsibility;

import java.util.Set;

public class Designer extends BaseHandler {
    private final Set<String> knownDesigns = Set.of("Airbus A320", "Airbus A380");

    @Override
    public void handle(String request) {
        if (knownDesigns.contains(request)) {
            System.out.println("Designing " + request);
            if (next != null) {
                next.handle(request);
            }
        } else {
            super.handle(request);
        }
    }
}
