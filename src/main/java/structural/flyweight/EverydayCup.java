package structural.flyweight;

public class EverydayCup implements Cup {
    private final String shape;
    private String content;

    public EverydayCup(String shape) {
        this.shape = shape;
    }

    @Override
    public void fill(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "EverydayCup[hashCode:" + this.hashCode() + "]{" +
                "content='" + content + '\'' +
                ", shape='" + shape + '\'' +
                '}';
    }
}
