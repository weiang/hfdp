/*************************************************************************
	> File Name: StatisticsDisplay.java
	> Author: Weiang
	> Mail: weiang@mail.ustc.edu.cn 
	> Created Time: 2014年05月01日 星期四 23时36分43秒
    > Describition: 
 ************************************************************************/

import java.util.Observable;
import java.util.Observer;
import java.util.ArrayList;

public class StatisticsDisplay implements Observer, DisplayElement {
	Observable observable;
	private float temperatureArg;
	private float temperatureMin;
	private float temperatureMax;
	private ArrayList temperatureHistory;

	public StatisticsDisplay(Observable observable) {
		temperatureHistory = new ArrayList();
		this.observable = observable;
		temperatureMin = 150;
		temperatureMax = -150;
		temperatureArg = 0;
		observable.addObserver(this);
	}

	public void update(Observable obs, Object arg) {
		if (obs instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) obs;
			if (weatherData.getTemperature() > temperatureMax)
				temperatureMax = weatherData.getTemperature();
			if (weatherData.getTemperature() < temperatureMin) 
				temperatureMin = weatherData.getTemperature();
			float tmp = temperatureArg * temperatureHistory.size() + weatherData.getTemperature();
			temperatureArg = tmp / (temperatureHistory.size() + 1);
			temperatureHistory.add(weatherData.getTemperature());
			display();
		}
	}

	public void display() {
		System.out.println("Arg/Max/Min temperature = " + temperatureArg + "/" + temperatureMax + "/" + temperatureMin);
	}
}

