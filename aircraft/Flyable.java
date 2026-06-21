package aircraft;
import tower.WeatherTower;
import coordinates.Coordinates;

public abstract class Flyable{
    protected WeatherTower weatherTower;
    public abstract void updateConditions();
    public void registerTower(WeatherTower tower){
        this.weatherTower = tower;
        tower.register(this);
    }
    public abstract long getId();
    public abstract String getName();
    public abstract Coordinates getCoordinates();
}