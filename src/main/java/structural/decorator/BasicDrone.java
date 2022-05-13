package structural.decorator;

public class BasicDrone implements Aircraft {
    @Override
    public String fly() {
        return "Just simple flying...";
    }
}
