package variablescope;

import java.util.Random;

public class DiceRoller {
	Random random;
	int number;
	DiceRoller() {
//		Random random = new Random();
//		int number = 0; to nie zadziala, bo sa lokalne czyli sa widoczne tylko w konstruktorze (kinda metoda) i trzeba je zadeklarowac jako globalne
		random = new Random();
		number = 0;
		roll();
	}
	void roll() {
		System.out.print(random.nextInt(6)+1);
		System.out.println(number);
	}
	
	
}
