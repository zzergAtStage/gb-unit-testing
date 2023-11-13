package seminars.fourth.task02;

public class WeatherServiceStub extends WeatherService {
    private int temperatureToReturn;

    public WeatherServiceStub(int temperatureToReturn) {
        this.temperatureToReturn = temperatureToReturn;
    }

    @Override

    public int getTemperature() {
        return this.temperatureToReturn;
    }
}
