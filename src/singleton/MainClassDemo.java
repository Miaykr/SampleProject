package singleton;

public class MainClassDemo {
    public static void main(String[] args) {
        SingletonDemo singletonDemo = SingletonDemo.getInstance();
        SingletonDemo singletonDemo2 = SingletonDemo.getInstance();

        System.out.println(singletonDemo.hashCode());
        System.out.println(singletonDemo2.hashCode());


    }
}
