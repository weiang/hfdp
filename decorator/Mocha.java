/*************************************************************************
	> File Name: Mocha.java
	> Author: Weiang
	> Mail: weiang@mail.ustc.edu.cn 
	> Created Time: 2014年05月02日 星期五 14时33分35秒
    > Describition: 
 ************************************************************************/

public class Mocha extends CondimentDecorator {
	Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	public double cost() {
		return .20 + beverage.cost();
	}
}

