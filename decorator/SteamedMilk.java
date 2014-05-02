/*************************************************************************
	> File Name: SteamedMilk.java
	> Author: Weiang
	> Mail: weiang@mail.ustc.edu.cn 
	> Created Time: 2014年05月02日 星期五 14时37分43秒
    > Describition: 
 ************************************************************************/

public class SteamedMilk extends CondimentDecorator {
	Beverage beverage;

	public SteamedMilk(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Steamed Milk";
	}

	public double cost() {
		return .10 + beverage.cost();
	}
}

