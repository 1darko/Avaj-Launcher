package weather;

public class WeatherProvider{
    private String[] weather = {"RAIN", "FOG", "SUN", "SNOW"};
    
    private static WeatherProvider wp = new WeatherProvider();

    private WeatherProvider(){};

    public static WeatherProvider getProvider(){
        return wp;
    };

    public String getCurrentWeather(Coordinates c){
        int index = (c.getLongitude() + c.getLatitude() + c.getHeight()) % 4;
        return (index < 0 ? weather[index + 4] : weather[index]);
    }
}