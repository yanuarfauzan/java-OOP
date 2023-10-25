package app.application;

import app.data.City;
import app.data.Location;

public class LocationApp {
    public static void main(String[] args) {

        var city = new City();
        city.name = "jakarta";

        System.out.println(city.name);

        // Polymorphisme

        Location location = new City();
        location.run();

    }
}
