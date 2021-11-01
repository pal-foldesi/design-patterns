package flyweight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CupFactory {
    private final Map<String, Cup> shapes = new HashMap<>();
    private final List<String> validShapes = List.of("Dorset", "Empire (early)", "Oxford");

    public Cup getFactoryCup(String shape) {
        if (shapes.containsKey(shape)) {
            return shapes.get(shape);
        } else if (validShapes.contains(shape)) {
            Cup cup = new EverydayCup(shape);
            shapes.put(shape, cup);
            return cup;
        }
        throw new IllegalArgumentException("Invalid cup shape: " + shape);
    }
}