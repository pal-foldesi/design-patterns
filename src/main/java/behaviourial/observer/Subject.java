package behaviourial.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private final List<Observer> observers = new ArrayList<>();
    private Ship latest;

    public void add(Observer o) {
        observers.add(o);
    }

    public Ship getLatest() {
        return latest;
    }

    public void setLatest(Ship latest) {
        this.latest = latest;
        broadcast();
    }

    private void broadcast() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
