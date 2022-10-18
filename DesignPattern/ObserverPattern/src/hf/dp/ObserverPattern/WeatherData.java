package hf.dp.ObserverPattern;

import java.util.ArrayList;

/**
 * 우체국
 * 실제 자료 들고있음
 */
public class WeatherData implements Subject{
    private ArrayList observers;//구독자목록
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers=new ArrayList();
    }
    @Override
    public void registerObserver(Observer o){//구독자 추가
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {//구독자제거
        int i=observers.indexOf(o);
        if(i>=0) observers.remove(i);
    }

    @Override
    public void notifyObservers() {//정보변경 구독자들에게 알림
        for(int i=0;i<observers.size();i++){
            Observer observer=(Observer) observers.get(i);
            observer.update(temperature,humidity,pressure);
        }
    }

    public void measurementsChanged(){//정보변경 실행
        notifyObservers();
    }
    public void setMeasurements(float temperature,float humidity,float pressure){//정보변경
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementsChanged();
    }
}
