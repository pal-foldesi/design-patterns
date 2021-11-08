package singleton;

import org.junit.jupiter.api.Test;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;

class DclThreadSafeSingletonTest {

    @Test
    void repeatedCallsReturnSameInstance() throws InterruptedException {
        int threadsAmount = 200;

        Set<DclThreadSafeSingleton> singletonSet = ConcurrentHashMap.newKeySet();

        ExecutorService executorService = Executors.newFixedThreadPool(threadsAmount);

        for (int i = 0; i < threadsAmount; i++) {
            executorService.execute(() -> {
                DclThreadSafeSingleton instance = DclThreadSafeSingleton.getInstance();
                singletonSet.add(instance);
            });
        }

        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MINUTES);

        assertThat(singletonSet.size()).isEqualTo(1);
    }
}
