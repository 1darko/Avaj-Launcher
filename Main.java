import aircraft.*;
import coordinates.Coordinates;
import tower.*;
import weather.*;

public class Main {
    public static void main(String[] args) {
        WeatherTower weatherTower = new WeatherTower();
        
        Flyable a = AircraftFactory.newAircraft("Baloon", "A1", new Coordinates(-200, 200, 100));
        a.registerTower(weatherTower);
        Flyable b = AircraftFactory.newAircraft("Baloon", "B1", new Coordinates(100, 20, 99));
        b.registerTower(weatherTower);
        Flyable c = AircraftFactory.newAircraft("Baloon", "C1", new Coordinates(370, 560, 109));
        c.registerTower(weatherTower);
        for(int i = 0; i < 15; i++){
            weatherTower.changeWeather();
        }
    }
}

// import abc.Abc;

// public class Main {
//     public static void main(String[] args) {
//         Abc test = new Abc();

//         test.display();
//     }
// }