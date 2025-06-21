// SingletonExample.java
public class SingletonExample {
    public static void main(String[] args) {
        AppConfig config1 = AppConfig.getInstance();
        AppConfig config2 = AppConfig.getInstance();

        System.out.println(config1 == config2);  // true → both are same instance
    }
}

// Singleton class
class AppConfig {
    // Step 1: private static instance
    private static AppConfig instance;

    // Step 2: private constructor
    private AppConfig() {
        System.out.println("AppConfig instance created");
    }

    // Step 3: public static method to get the instance (lazy loading)
    public static AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();  // only created once
        }
        return instance;
    }
}
