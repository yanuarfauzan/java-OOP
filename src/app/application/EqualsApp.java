package app.application;

public class EqualsApp {
    public static void main(String[] args) {
        String first = "Yanuar";
        first = first + " " + "Fauzan";

        System.out.println(first);

        String second = "Yanuar Fauzan";
        System.out.println(second);

        System.out.println(first.equals(second));

        // yang dibawah ini membandingkan apakah objek yang sama bukan apakah isinya sama
        System.out.println(first == second);

    }
}
