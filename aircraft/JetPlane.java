package aircraft;
import coordinates.Coordinates;
import tower.WeatherTower;


public class JetPlane extends Aircraft{
    public JetPlane(long p_id, String p_name, Coordinates p_c){
        super(p_id, p_name, p_c);
    }

    public void updateConditions(){
        String weather = this.weatherTower.getWeather(this.coordinates);
        if(weather.equals("SUN")){
            //logique
        }
        else if(weather.equals("RAIN")){
            //logique
        }
        else if(weather.equals("FOG")){
            //logique
        }
        else if(weather.equals("SNOW")){
            //logique
        }
    }
}

/*◦ SUN - Latitude increases with 10, Height increases with 2
◦ RAIN - Latitude increases with 5
◦ FOG - Latitude increases with 1
◦ SNOW - Height decreases with 7*/