package Breakout;

public class Animal {
	public void act () {
		System.out.println("no action possible from undefined animal");
	}
	
}

class Human extends Animal{
	@Override
	public void act() {
		System.out.println("I play games!");
	}
}
class Tiger extends Animal{
	@Override
	public void act() {
		System.out.println("I prey on little chickens");
	}
}
