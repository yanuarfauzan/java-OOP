package app.data;

public class Application {
    public static final int PROCESSOR;

    static {
        System.out.println("Mengakses Class Application");
        PROCESSOR = Runtime.getRuntime().availableProcessors();
    }
}
