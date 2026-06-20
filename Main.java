import aircraft.*;
import coordinates.Coordinates;
import tower.*;
import weather.WeatherTower;

public class Main {
    public static void main(String[] args) {
        Baloon baloon = AircraftFactory.newAircraft("Baloon", "B1", new Coordinates(10, 20, 30));
        WeatherTower weatherTower = new WeatherTower();
        baloon.registerTower(weatherTower);
    }
}