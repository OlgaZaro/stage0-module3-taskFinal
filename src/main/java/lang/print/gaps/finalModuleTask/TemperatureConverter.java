package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public static void main(String[] args) {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        temperatureConverter.toFahrenheit(27);
    }
    public void toFahrenheit(int temperatureCelsius){
        double fahrenheit = temperatureCelsius * 9 / 5.0 + 32;
        System.out.println(fahrenheit);
    }
}
