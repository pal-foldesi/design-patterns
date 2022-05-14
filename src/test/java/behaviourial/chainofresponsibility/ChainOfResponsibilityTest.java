package behaviourial.chainofresponsibility;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.never;
import static org.mockito.internal.verification.VerificationModeFactory.times;

class ChainOfResponsibilityTest {

    @Test
    void doesNotCallNextHandlerIfRequestIsNotReasonable() {
        Handler h1 = new Designer();
        Handler h2 = Mockito.spy(new Simulator());

        h1.setNext(h2);

        String unreasonableRequest = "Duck";

        h1.handle(unreasonableRequest);

        Mockito.verify(h2, never()).handle(unreasonableRequest);
    }

    @Test
    void doesCallNextHandlerIfRequestIsReasonable() {
        Handler h1 = new Designer();
        Handler h2 = Mockito.spy(new Simulator());
        Handler h3 = Mockito.spy(new Constructor());
        Handler h4 = Mockito.spy(new Assembler());

        h1.setNext(h2);
        h2.setNext(h3);
        h3.setNext(h4);

        String reasonableRequest = "Airbus A320";

        h1.handle(reasonableRequest);

        Mockito.verify(h2, times(1)).handle(reasonableRequest);
        Mockito.verify(h3, times(1)).handle(reasonableRequest);
        Mockito.verify(h4, times(1)).handle(reasonableRequest);
    }
}
