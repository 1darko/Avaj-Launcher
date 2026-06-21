package tower;
import coordinates.Coordinates;
import weather.WeatherProvider;

public class WeatherTower extends Tower{
    public String getWeather(Coordinates c){
        return WeatherProvider.getProvider().getCurrentWeather(c);
    }
    public void changeWeather(){
        this.conditionChanged();
    }
}