package Breakout;

import java.util.ArrayList;

public class testAnimal {

	public static void main(String[] args) {
		
		ArrayList <Animal> myAnimals = new ArrayList <>();
		
		for(int i = 0; i < 5; i ++) {
			if(Math.random() > 0.5) {
				myAnimals.add(new Human());
			}
			else {
				myAnimals.add(new Tiger());
			}
		}
		
	
		for(Animal a : myAnimals) {
			a.act();
		}
	}

}
