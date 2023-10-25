class Manajer extends Employee {

    String name;
    Manajer(String name)
    {
        super(name);
        this.name = name;
    }

    void sayHello(String name) {
        System.out.println("Hi " + name + " My Name is Manajer" + this.name);
    }
}

