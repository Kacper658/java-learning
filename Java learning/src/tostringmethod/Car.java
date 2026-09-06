package tostringmethod;

class Car {
	String make = "Ford";
	String model = "Mustang";
	String color = "red";
	int year = 1974;
	
	@Override
	public String toString() {
		return make + " " + model + " color " + color + " year " +year;
	}
}
