package structural.composite;

import java.util.List;
import java.util.stream.Collectors;

public class Backpack implements Container {
    private String name;

    private final List<Container> contents;

    public Backpack(String name, List<Container> contents) {
        this.name = name;
        this.contents = contents;
    }

    @Override
    public String getName() {
        String backpackName = this.name;
        if (!contents.isEmpty()) {
            String childNames =
                    contents.stream().map(Container::getName).collect(Collectors.joining("\n", "\n", ""));
            backpackName += childNames;
        }
        return backpackName;
    }
}
