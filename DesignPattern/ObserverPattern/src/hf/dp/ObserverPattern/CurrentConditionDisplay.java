package hf.dp.ObserverPattern;

public class CurrentConditionDisplay implements Observer,DisplayElement{
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData){
        this.weatherData=weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Current condition: "+temperature+","+humidity);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
    this.temperature=temperature;
    this.humidity=humidity;
    display();
    }
}
