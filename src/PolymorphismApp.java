public class PolymorphismApp {
    public static void main(String[] args) {
        // Perubahan bentuk (Polimorphism)
        Employee employee = new Employee("Yanuar");
        employee.sayHello("mumu");

        employee = new Manajer("jujun");
        employee.sayHello("budi");

        employee = new VicePrecident("Anisa");
        employee.sayHello("amir");

        sayHello(new Employee("Yanuar"));
        sayHello(new Manajer("Jujun"));
        sayHello(new VicePrecident("Anisa"));
    }

    static void sayHello(Employee employee)
    {
        System.out.println("Hello " + employee.name);
    }
}
