package creational.prototype;

import java.util.Map;

public class PrototypeRegistry {
    private final Map<Class, Prototype> prototypes = Map.of(Duck.class, new Duck(), Goose.class, new Goose());

    public Prototype getNew(Class clazz) {
        Prototype found = prototypes.get(clazz);
        if (found == null) {
            throw new IllegalArgumentException("Prototype with class: " + clazz.getName() + " not found!");
        } else {
            return found.clonePrototype();
        }
    }
}
