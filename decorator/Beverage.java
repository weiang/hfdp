/*************************************************************************
	> File Name: Beverage.java
	> Author: Weiang
	> Mail: weiang@mail.ustc.edu.cn 
	> Created Time: 2014年05月02日 星期五 14时16分18秒
    > Describition: 
 ************************************************************************/

public abstract class Beverage {
	String description = "Unknown Beverage";

	public String getDescription() {
		return description;
	}

	public abstract double cost();
}


