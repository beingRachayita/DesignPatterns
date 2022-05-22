package TheStrategyPattern;

public class ModelDuck extends Duck {
	
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new MuteQuack();
	}

	@Override
	public void swim() {
		System.out.println("I can Float");
	}

	@Override
	public void display() {
		System.out.println("I am a ModelDuck");

	}

}
