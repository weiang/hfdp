/*************************************************************************
	> File Name: CurrentConditionsDisplay.java
	> Author: Weiang
	> Mail: weiang@mail.ustc.edu.cn 
	> Created Time: 2014年05月01日 星期四 21时13分15秒
    > Describition: 
 ************************************************************************/

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private Subject weatherData;

	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

	public void display() {
		System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
	}
}
