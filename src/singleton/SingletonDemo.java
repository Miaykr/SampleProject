package singleton;

public class SingletonDemo {
    private static SingletonDemo instance = null;

    private SingletonDemo() {

    }

    public static SingletonDemo getInstance() {
        synchronized (SingletonDemo.class) {
            if (instance == null) {
                instance = new SingletonDemo();
            }
        }
        return instance;
    }
}
