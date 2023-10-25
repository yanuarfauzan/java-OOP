// Inheritance
class VicePrecident extends Manajer {
    // Wajib panggil consturctor parent ketika constructer parent nya ada parameter
    // Kecuali Default
    VicePrecident(String name)
    {
        // keyword super panggil constructor parent
        super(name);
    }
    // Method Override
    @Override
    void sayHello(String name) {
        System.out.println("Hi " + name + " My Name is Vp" + this.name);
    }
}
