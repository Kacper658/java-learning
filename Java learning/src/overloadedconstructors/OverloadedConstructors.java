package overloadedconstructors;

class OverloadedConstructors {

	public static void main(String[] args) {
		// Przeladowywanie konstruktorow - tak samo jak metody (nazwa +  parametry = unikalny podpis)
		Pizza pizza = new Pizza(null);
		Pizza[] array = new Pizza[1000000];
		for (int i = 0; i<array.length; i++) {
			array[i] = new Pizza("sus");
		}
		System.out.println("end");
	}

}
