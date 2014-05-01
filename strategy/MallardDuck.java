/*************************************************************************
	> File Name: MallardDuck.java
	> Author: Weiang
	> Mail: weiang@mail.ustc.edu.cn 
	> Created Time: 2014年05月01日 星期四 14时02分35秒
    > Describition: 
 ************************************************************************/

public class MallardDuck extends Duck {
	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	public void display() {
		System.out.println("I'm a really Mallard duck");
	}
}
