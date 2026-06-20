package aircraft;
import coordinates.Coordinates;

public class AircraftFactory{
    private static long idCounter = 0;
    private static long getId(){
        return ++idCounter;
    }
    public static Flyable newAircraft(String p_type, String p_name, Coordinates p_c){
        switch(p_type){
            case "Helicopter":
                return new Helicopter(getId(), p_name, p_c);
            case "JetPlane":
                return new JetPlane(getId(), p_name, p_c);
            case "Baloon":
                return new Baloon(getId(), p_name, p_c);
            default:
                throw new IllegalArgumentException("Invalid aircraft type: " + p_type);
        }
    }
}