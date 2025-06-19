public class Logger {
    // Step 1: Create private static instance
    private static Logger instance;

    // Step 2: Make constructor private to prevent instantiation
    private Logger() {
        System.out.println("Logger Initialized");
    }

    // Step 3: Provide public static method to get the instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Optional: A method to demonstrate logging
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
