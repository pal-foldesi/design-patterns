package creational.singleton;

public class ThreadSafeSingleton {
    private static class InstanceHolder {
        static final ThreadSafeSingleton INSTANCE = new ThreadSafeSingleton();
    }

    public static ThreadSafeSingleton getInstance() {
        return InstanceHolder.INSTANCE;
    }

    private ThreadSafeSingleton() {
    }
}
