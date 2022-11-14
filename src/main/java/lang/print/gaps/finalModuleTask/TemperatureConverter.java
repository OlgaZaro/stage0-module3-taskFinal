package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public static void main(String[] args) {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        temperatureConverter.toFahrenheit(5);
    }
    public void toFahrenheit(int temperatureCelsius){
        System.out.println((temperatureCelsius * 1.8) + 32);
    }
}
