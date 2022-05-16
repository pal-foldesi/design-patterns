package behaviourial.observer;

public class LighthouseGuard extends Observer {
    public LighthouseGuard(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        Ship latest = subject.getLatest();
        System.out.println(this + " has just learned that the " + latest + " has entered port");
    }

    public String toString() {
        return "Lighthouse Guard";
    }
}
