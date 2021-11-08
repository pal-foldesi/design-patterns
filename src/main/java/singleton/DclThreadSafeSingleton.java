package singleton;

/**
 * A Singleton that uses double-checked locking.
 */
public class DclThreadSafeSingleton {
    private static volatile DclThreadSafeSingleton instance = null;

    private DclThreadSafeSingleton() {
    }

    public static DclThreadSafeSingleton getInstance() {
        DclThreadSafeSingleton result = instance;
        if (result == null) {
            synchronized (DclThreadSafeSingleton.class) {
                result = instance;
                if (result == null) {
                    instance = result = new DclThreadSafeSingleton();
                }
            }
        }
        return result;
    }
}
