package behaviourial.chainofresponsibility;

import java.util.Set;

public class Constructor extends BaseHandler {
    private final Set<String> knownConstructions = Set.of("Airbus A320", "Airbus A380");

    @Override
    public void handle(String request) {
        if (knownConstructions.contains(request)) {
            System.out.println("Constructing " + request);
            if (next != null) {
                next.handle(request);
            }
        } else {
            super.handle(request);
        }
    }
}
