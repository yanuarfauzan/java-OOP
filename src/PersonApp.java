public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person("Yanuar", "Ciamis");
        // Overloadin Contructor
        var person2 = new Person("Yanuar");
        person1.sayHello("Budi");
    }
}
