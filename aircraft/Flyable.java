package aircraft;
import weather.WeatherTower;

abstract class Flyable{
    protected WeatherTower weatherTower;
    public abstract void updateConditions();
    public void registerTower(WeatherTower tower){
        this.weatherTower = tower;
    }
}