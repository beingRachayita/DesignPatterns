package TheStrategyPattern;

public class StrategyDemo {

	public static void main(String[] args) {
		Duck d = new MallardDuck();
		d.display();
		d.swim();
		d.performFly();
		d.performQuack();
		
		
		d = new RubberDuck();
		d.display();
		d.swim();
		d.performFly();
		d.performQuack();
		
		d = new ModelDuck();
		d.display();
		d.swim();
		d.performFly();
		d.performQuack();
	}

}
