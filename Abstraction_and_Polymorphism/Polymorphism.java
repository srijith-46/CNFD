package pog;

abstract class Vechicle{
	abstract void drive();
	}

class Car extends Vechicle{
	void drive() {
		System.out.println("Car speed 200");
	}
}

class MotorCycle extends Vechicle{
	void drive() {
		System.out.println("MotorCycle speed 230");
}
}

class Polymorphism{
	public static void main(String[] args) {
		Vechicle c = new Car();
		Vechicle m = new MotorCycle();
		c.drive();
		m.drive();
		
	}  
}
	
	
	
	
	
	
	
