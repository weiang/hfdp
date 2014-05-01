/*************************************************************************
	> File Name: WeatherStation.java
	> Author: Weiang
	> Mail: weiang@mail.ustc.edu.cn 
	> Created Time: 2014年05月01日 星期四 23时31分25秒
    > Describition: 
 ************************************************************************/

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentDisplay =
			new CurrentConditionsDisplay(weatherData);
		
		StatisticsDisplay statisticsDisplay = 
			new StatisticsDisplay(weatherData);
		
		ForecastDisplay forecastDisplay = 
			new ForecastDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
