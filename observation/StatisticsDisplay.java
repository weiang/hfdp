/*************************************************************************
	> File Name: StatisticsDisplay.java
	> Author: Weiang
	> Mail: weiang@mail.ustc.edu.cn 
	> Created Time: 2014年05月01日 星期四 21时24分35秒
    > Describition: 
 ************************************************************************/
import java.util.*;

public class StatisticsDisplay implements Observer, DisplayElement {
	private ArrayList temperatureHistory;
	private float temperatureMax;
	private float temperatureMin;
	private float temperatureArg;
	private Subject weatherData;

	public StatisticsDisplay(Subject weatherData) {
		temperatureHistory = new ArrayList();
		temperatureMax = -150;
		temperatureMin = 150;
		temperatureArg = 0;
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float temperature, float humidity, float pressure) {
		if (temperature > temperatureMax) 
			temperatureMax = temperature;
		if (temperature < temperatureMin)
			temperatureMin = temperature;
		temperatureArg = (temperatureArg * temperatureHistory.size() + temperature) / (temperatureHistory.size() + 1);
		temperatureHistory.add(temperature);
		display();
	}

	public void display() {
		System.out.println("Avg/Max/Min temperature: " + temperatureArg + "/" + temperatureMax + "/" + temperatureMin);
	}
}

