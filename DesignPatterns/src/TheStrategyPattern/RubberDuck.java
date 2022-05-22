package TheStrategyPattern;

public class RubberDuck extends Duck{
	
	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}

	@Override
	public void swim() {
		System.out.println("I can Float!");
		
	}

	@Override
	public void display() {
		System.out.println("I am Rubber Duck");
		
	}

}
