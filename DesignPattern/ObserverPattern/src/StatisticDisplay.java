public class StatisticDisplay implements Observer,DisplayElement{
    private float Maxtemp;
    private float Mintemp;
    private float Average;
    private Subject weatherData;

    public StatisticDisplay(Subject weatherData){
        this.weatherData=weatherData;
        weatherData.registerObserver(this);//자기자신 옵저버 등록
    }
    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature="+Average+"/"+Maxtemp+"/"+Mintemp);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        if(temp>Maxtemp) Maxtemp=temp;
        if(temp<Mintemp||Mintemp==0) Mintemp=temp;
        Average=(Maxtemp+Mintemp)/2;
        display();
    }
}
