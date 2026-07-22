import java.util.List;
import java.util.ArrayList;

public class WeatherData implements Subject{
    private List<Observer> observers;
    private float temp, humidity, pressure;

    public WeatherData(){
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o){
        observers.add(o);
    }

    public void removeObserver(Observer o){
        observers.remove(o);
    }

    public void notifyObservers(){
        for(Observer o: observers){
            o.update();
        }
    }

    public void setMeasurements(float temp, float humidity, float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }

    public float getTemp(){
        return temp;
    }

    public float getHumidity(){
        return humidity;
    }

    public float getPressure(){
        return pressure;
    }
}