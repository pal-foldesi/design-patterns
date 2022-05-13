package creational.object_pool;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Pool {
    private static final List<Resource> resources = new ArrayList<>();

    private static final Pool INSTANCE = new Pool();
    private static final int POOL_SIZE = 4;

    private Pool() {} //Disable instantiation from outside

    public static Pool getInstance() {
        while (resources.size() < POOL_SIZE) {
            resources.add(new Resource());
        }

        return INSTANCE;
    }

    public Resource acquire() {
        Optional<Resource> availableResource = resources.stream().filter(resource -> resource.getState().equals(State.AVAILABLE)).findAny();

        if (availableResource.isPresent()) {
            Resource resource = availableResource.get();
            resource.setState(State.ACQUIRED);
            return resource;
        } else {
            throw new IllegalStateException("No resources currently available!");
        }
    }

    public void release(Resource resourceToReturn) {
        final Resource resourceToSetAvailable = resourceToReturn;
        Optional<Resource> acquiredResource = resources.stream().filter(resource -> resource.equals(resourceToSetAvailable)).findFirst();

        if (acquiredResource.isPresent()) {
            Resource resource = acquiredResource.get();
            resource.reset();
        } else {
            throw new IllegalArgumentException("Resource not found!");
        }
    }
}
