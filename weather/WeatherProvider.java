package weather;
import coordinates.Coordinates;

public class WeatherProvider{
    private String[] weather = {"RAIN", "FOG", "SUN", "SNOW"};
    
    private static WeatherProvider wp = new WeatherProvider();

    private WeatherProvider(){};

    public static WeatherProvider getProvider(){
        return wp;
    };

    public String getCurrentWeather(Coordinates c){
        int index = (c.getLongitude() + c.getLatitude() + c.getHeight() - 7) % 4;
        System.out.println(index);
        return (index < 0 ? weather[index + 4] : weather[index]);
    }
}