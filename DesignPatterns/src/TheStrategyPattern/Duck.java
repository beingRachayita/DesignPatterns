package TheStrategyPattern;

public abstract class Duck {
	
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	void performFly() {
		flyBehavior.fly();
	}

	void performQuack() {
		quackBehavior.quack();
	}
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	public abstract void swim();
	
	public abstract void display();
	
	
	
}

