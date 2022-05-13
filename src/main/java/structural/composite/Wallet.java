package structural.composite;

public class Wallet implements Container {
    private final String name;

    public Wallet(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
