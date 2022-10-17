public class ForecastDisplay implements Observer,DisplayElement{
    private Subject weatherData;
    private String forecastmsg;
    private float press;

    public ForecastDisplay(Subject weatherData){
        this.weatherData=weatherData;
        this.forecastmsg="yet no forecast";
        weatherData.registerObserver(this);

    }
    @Override
    public void display() {
        System.out.println(forecastmsg);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        //어떤 온도,습도,압력일 경우에 어떤 일기예보가나오는지 조건을 알 수 없음
        if(press==0){
            forecastmsg = "Improving weather on the way!";
            press=pressure;
        }else if(pressure > press) {
            forecastmsg = "Improving weather on the way!";
            press=pressure;
        }else if(pressure<press) {
            forecastmsg="Watch out for cooler,rainy weather";
            press=pressure;
        } else if(pressure==press) {
            forecastmsg="More of the same";
            press=pressure;
        }

        display();
    }
}
