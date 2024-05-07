import java.util.ArrayList;
import java.util.List;

public class ConcuretWeatherStatiion implements  WeatherStation{

    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public  ConcuretWeatherStatiion(){
        observers = new ArrayList<>();
    }

    public  void updateWeather(float temperature , float humidity , float pressure){
        this.humidity= humidity;
        this.temperature = temperature;
        this.pressure = pressure;
        notifyMe();
    }


    @Override
    public void add(Observer ob) {
            observers.add(ob);
    }

    @Override
    public void remove(Observer ob) {
        observers.remove(ob);
    }

    @Override
    public void notifyMe() {
        String msg = "temp "+temperature +" humidity "+humidity+"  pressure "+pressure;
        for(Observer ob : observers){
            ob.update(msg);
        }
    }
}
