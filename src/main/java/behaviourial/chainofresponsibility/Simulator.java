package behaviourial.chainofresponsibility;

import java.util.Set;

public class Simulator extends BaseHandler {
    private final Set<String> knownSimulations = Set.of("Airbus A320", "Airbus A380");

    @Override
    public void handle(String request) {
        if (knownSimulations.contains(request)) {
            System.out.println("Simulating " + request);
            if (next != null) {
                next.handle(request);
            }
        } else {
            super.handle(request);
        }
    }
}
