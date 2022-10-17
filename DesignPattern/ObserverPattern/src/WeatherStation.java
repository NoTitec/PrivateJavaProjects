public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData=new WeatherData();//subject(broadcast 할 data 가진 우체국)

        CurrentConditionDisplay currentConditionDisplay=new CurrentConditionDisplay(weatherData);//observer
        StatisticDisplay statisticDisplay=new StatisticDisplay(weatherData);
        ForecastDisplay forecastDisplay=new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80.f,65,30.4f);//Subject 에 데이터 등록
        weatherData.setMeasurements(82.f,70,29.2f);
        weatherData.setMeasurements(78.f,90,29.2f);
    }
}
