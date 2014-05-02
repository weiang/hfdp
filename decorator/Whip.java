/*************************************************************************
	> File Name: Whip.java
	> Author: Weiang
	> Mail: weiang@mail.ustc.edu.cn 
	> Created Time: 2014年05月02日 星期五 14时35分39秒
    > Describition: 
 ************************************************************************/

public class Whip extends CondimentDecorator {
	Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	public double cost() {
		return .10 + beverage.cost();
	}
}

