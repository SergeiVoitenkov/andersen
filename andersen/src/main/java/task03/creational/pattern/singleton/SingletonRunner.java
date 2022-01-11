package task03.creational.pattern.singleton;

/**
 * Паттерн Singleton
 * Создание объекта в единственном экземпляре для однопоточного приложения, предоставляющие глобальную точку доступа к этому экземпляру.
 * Для многопоточного приложения необходимо метод getInstance() сделать 'synchronized'.
 */

public class SingletonRunner {

    public static SingletonRunner instance;

    public static SingletonRunner getInstance() {
        if (instance == null) {
            instance = new SingletonRunner();
        }
        return instance;
    }

    private SingletonRunner() {
    }

    public void print() {
        System.out.println(instance);
    }
}