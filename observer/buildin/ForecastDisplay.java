/*************************************************************************
	> File Name: ForecastDisplay.java
	> Author: Weiang
	> Mail: weiang@mail.ustc.edu.cn 
	> Created Time: 2014年05月02日 星期五 00时15分03秒
    > Describition: 
 ************************************************************************/
import java.util.Observer;
import java.util.Observable;

public class ForecastDisplay implements Observer, DisplayElement {
	private Observable observable;
	private float lastPressure;
	private float currentPressure;

	public ForecastDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
		currentPressure = 29.92f;
	}

	public void update(Observable obs, Object obj) {
		if (obs instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) new WeatherData();
			lastPressure = currentPressure;
			currentPressure = weatherData.getPressure();
			display();
		}
	}

	public void display() {
		if (currentPressure > lastPressure) 
			System.out.println("Watch out for cooler, rainy day!");
		else if (currentPressure == lastPressure) 
			System.out.println("More of the same!");
		else 
			System.out.println("Good day!");
	}
}
