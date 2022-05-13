package creational.object_pool;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ObjectPoolTest {

    @Test
    void objectPoolThrowsWhenNoAvailableResources() {
        Pool pool = Pool.getInstance();
        Set<Resource> acquiredResources = new HashSet<>();
        for (int i = 1; i <= 4; i++) {
            acquiredResources.add(pool.acquire());
        }
        assertThrows(IllegalStateException.class, pool::acquire);
        for (Resource res : acquiredResources) {
            pool.release(res);
        }
    }

    @Test
    void objectPoolCanReuseResources() {
        Pool pool = Pool.getInstance();
        Resource resource = null;
        Set<Resource> acquiredResources = new HashSet<>();
        for (int i = 1; i <= 4; i++) {
            resource = pool.acquire();
            acquiredResources.add(resource);
        }
        pool.release(resource);
        acquiredResources.remove(resource);
        Resource newReference = pool.acquire();
        assertThat(newReference).isEqualTo(resource);

        pool.release(newReference);

        for (Resource res : acquiredResources) {
            pool.release(res);
        }
    }
}
