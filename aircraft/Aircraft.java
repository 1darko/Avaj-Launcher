package aircraft;
import coordinates.Coordinates;

public class Aircraft extends Flyable{
    protected long id;
    protected String name;
    protected Coordinates coordinates;

    protected Aircraft(long p_pd, String p_name, Coordinates p_c){
        this.id = p_pd;
        this.name = p_name;
        this.coordinates = p_c;
    };
    public long getId(){
        return this.id;
    };
    public String getName(){
        return this.name;
    };
    public Coordinates getCoordinates(){
        return this.coordinates;
    };
    public void updateConditions(){
        // Flyable is abstract
    };
}