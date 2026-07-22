import java.util.Scanner;
public class WeatherStation{
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay curr = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay fcd = new ForecastDisplay(weatherData);
        HeatIndexDisplay hid = new HeatIndexDisplay(weatherData);
        StatisticsDisplay sd = new StatisticsDisplay(weatherData);
        
        weatherData.setMeasurements(27, 80, 1.003f);
        System.out.println("");
        weatherData.setMeasurements(26, 90, 0.97f);
        System.out.println("");
        weatherData.setMeasurements(26.7f, 45, 0.93f);
        System.out.println("");
        weatherData.setMeasurements(29.2f, 44, 1.04f);
        System.out.println("");
        weatherData.setMeasurements(31, 23, 1.1f);
        System.out.println("");
    }
}