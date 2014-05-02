/*************************************************************************
	> File Name: Soy.java
	> Author: Weiang
	> Mail: weiang@mail.ustc.edu.cn 
	> Created Time: 2014年05月02日 星期五 14时27分37秒
    > Describition: 
 ************************************************************************/

public class Soy extends CondimentDecorator {
	Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	public double cost() {
		return beverage.cost() + .15;
	}
}

