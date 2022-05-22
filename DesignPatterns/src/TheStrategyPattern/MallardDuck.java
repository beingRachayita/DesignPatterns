package TheStrategyPattern;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}

	@Override
	public void swim() {
		System.out.println("I can Swim");
	}

	@Override
	public void display() {
		System.out.println("I am Mallard Duck");
	}

}
