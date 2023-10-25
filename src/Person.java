class Person {
    String name;
    String address;

    Person(String paramName, String paramAddress) {
        this.name = paramName + " Fauzan";
        this.address = paramAddress;
    }

    // Overloading Contuctor
    Person(String paramName) {
        this(paramName, null);
    }

    // void tidak mengembalikan data apapun
    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", My Name Is " + name + ", I live in " + address);
    }
}