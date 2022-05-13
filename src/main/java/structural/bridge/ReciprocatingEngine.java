package structural.bridge;

public class ReciprocatingEngine implements Engine {
    @Override
    public void generatePower() {
        System.out.println("Intake-Compression-Power-Exhaust...");
    }
}
