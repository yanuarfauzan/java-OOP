package app.data;

public interface Car extends HasBrand, IsMaintenance {
    void drive();

    int getTire();

    // tidak wajib di override di class yang meng implements interface Car
    default boolean isBig() {
        return false;
    }

}
