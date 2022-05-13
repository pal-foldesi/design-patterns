package structural.bridge;

public class TurbineEngine implements Engine {
    @Override
    public void generatePower() {
        System.out.println("Compress-rotate-expel...");
    }
}
