public class ManajerApp {
    public static void main(String[] args) throws Exception {
        var manajer = new Manajer("jujun");
        manajer.sayHello("budi");

        var vp = new VicePrecident("joko");
        vp.sayHello("mumu");
    }
}
