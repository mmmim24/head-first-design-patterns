import java.util.List;
import java.util.ArrayList;

public class WeatherData implements Subject{
    private List<Observer> observers;
    private float temp, humidity, pressure;

    public WeatherData(){
        this.observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o){
        this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o){
        this.observers.remove(o);
    }

    @Override
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