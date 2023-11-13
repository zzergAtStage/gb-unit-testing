package seminars.fourth.task02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WeatherAdviceServiceTest {
//we're using a stub method for testing other services

    @Test
    void testGetWeatherAdvice_Hot() {
        WeatherService weatherServiceStub = new WeatherServiceStub(35);
        WeatherAdviceService weatherAdviceService = new WeatherAdviceService(weatherServiceStub);

        String advice = weatherAdviceService.getWeatherAdvice();

        assertEquals("It's hot outside, wear a hat!", advice);
    }
    @Test
    void testGetWeatherAdvice_Cold() {
        WeatherService weatherServiceStub = new WeatherServiceStub(-5);
        WeatherAdviceService weatherAdviceService = new WeatherAdviceService(weatherServiceStub);

        String advice = weatherAdviceService.getWeatherAdvice();

        assertEquals("It's freezing, wear a coat!", advice);
    }
    @Test
    void testGetWeatherAdvice_Pleasant() {
        WeatherService weatherServiceStub = new WeatherServiceStub(20);
        WeatherAdviceService weatherAdviceService = new WeatherAdviceService(weatherServiceStub);

        String advice = weatherAdviceService.getWeatherAdvice();

        assertEquals("It's a nice day!", advice);
    }


}