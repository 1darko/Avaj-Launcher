package tower;
import java.util.ArrayList;
import java.util.List;
import aircraft.Flyable;

public class Tower{
    private List<Flyable> observers = new ArrayList<Flyable>();
    
    public void register(Flyable f){
        observers.add(f);
        System.out.println("Tower says: " + f.getName() + "(" + f.getId() + ") registered to weather tower.");
    }
    public void unregister(Flyable f){
        observers.remove(f);
        System.out.println("Tower says: " + f.getName() + "(" + f.getId() + ") unregistered from weather tower.");
    }
    protected void conditionChanged(){
        List<Flyable> copy = new ArrayList<Flyable>(observers);
        for(Flyable observer : copy){
            observer.updateConditions();
        }
    }
}