package aircraft;
import coordinates.Coordinates;
import tower.WeatherTower;


public class Baloon extends Aircraft{
    public Baloon(long p_id, String p_name, Coordinates p_c){
        super(p_id, p_name, p_c);
    }
    
    int heightProtection(int value, int min, int max){
        return Math.max(min, Math.min(value, max));
    }

    public void updateConditions(){
        String weather = this.weatherTower.getWeather(this.coordinates);

        switch(weather){
            case "SUN":
                this.coordinates.changeLongitude(2);
                this.coordinates.changeHeight(4);
                System.out.println("Baloon#" + this.name + "(" + this.id + "): Let's enjoy the good weather and take some pics.");
                break;
            case "RAIN":
                this.coordinates.changeHeight(-5);
                System.out.println("Baloon#" + this.name + "(" + this.id + "): It's raining, let's be careful.");
                break;
            case "FOG":
                this.coordinates.changeHeight(-3);
                System.out.println("Baloon#" + this.name + "(" + this.id + "): It's foggy, let's be careful.");
                break;
            case "SNOW":
                this.coordinates.changeHeight(-15);
                System.out.println("Baloon#" + this.name + "(" + this.id + "): It's snowing, let's be careful.");
                break;
        }
        // this.coordinates.changeHeight(heightProtection(this.coordinates.getHeight(), 0, 100));
        if (this.coordinates.getHeight() <= 0){
            this.weatherTower.unregister(this);
        }
        else{
            System.out.println("Baloon#" + this.name + "(" + this.id + "): at height :" + this.coordinates.getHeight());
        }
    }
}

/*SUN - Longitude increases with 2, Height increases with 4
◦ RAIN - Height decreases with 5
◦ FOG - Height decreases with 3
◦ SNOW - Height decreases with 15*/