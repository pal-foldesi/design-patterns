package behaviourial.chainofresponsibility;

import java.util.Set;

public class Assembler extends BaseHandler {
    private final Set<String> knownAssemblies = Set.of("Airbus A320", "Airbus A380");

    @Override
    public void handle(String request) {
        if (knownAssemblies.contains(request)) {
            System.out.println("Assembling " + request);
            if (next != null) {
                next.handle(request);
            }
        } else {
            super.handle(request);
        }
    }
}
