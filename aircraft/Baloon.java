package aircraft;

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
                this.longitude += 2;
                this.height += 4;
                break;
            case "RAIN":
                this.height -= 5;
                break;
            case "FOG":
                this.height -= 3;
                break;
            case "SNOW":
                this.height -= 15;
                break;
        }
        this.height = heightProtection(this.height, 0, 100);
        if (this.height == 0){
            this.weatherTower.unregister(this);
        }
    }
}

/*SUN - Longitude increases with 2, Height increases with 4
◦ RAIN - Height decreases with 5
◦ FOG - Height decreases with 3
◦ SNOW - Height decreases with 15*/