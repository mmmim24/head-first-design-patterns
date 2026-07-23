public class CurrentConditionsDisplay implements Observer, DisplayElement{
    private float temp,humidity,pressure;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update(){
        this.temp = weatherData.getTemp();
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure();
        display();
    }

    @Override
    public void display(){
        System.out.println("Current Conditions: "+ temp+"° C degrees and "+humidity+"% humidity with "+pressure+" bar pressure");
    }
}