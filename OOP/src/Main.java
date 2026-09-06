
public class Main {

	public static void main(String[] args) {
		// obiekty - klasa zawierająca atrybuty i metody
		Car myCar = new Car();
		Car car2 = new Car();
		
		
		System.out.println(myCar.make);
		System.out.println(myCar.model);
		
		System.out.println(car2.make);
		System.out.println(car2.model);
		
		myCar.drive();
		myCar.brake();
		// obiekt (klasa w java) Car jest "blueprintem"
	}

}
