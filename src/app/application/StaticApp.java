package app.application;

import static app.data.Application.*;
import static app.data.Constant.*;
import app.data.Country;
import app.utils.MathUtil;

public class StaticApp {
    public static void main(String[] args) {
        // Pemanggilan static field
        System.out.println(APPLICATION);
        System.out.println(VERSION);

        // Pemanggilan static method
        System.out.println(MathUtil.sum(1, 1, 1, 1, 1));

        // Pemagnggilan static inner class
        Country.City city = new Country.City();
        city.setName("Ciamis");
        System.out.println(city.getName());

        System.out.println(PROCESSOR);

    }
}
