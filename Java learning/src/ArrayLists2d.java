import java.util.*;

public class ArrayLists2d {

	public static void main(String[] args) {
		ArrayList<String> bakeryList = new ArrayList<String>();
		bakeryList.add("pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("donuts");
		ArrayList<String> produceList = new ArrayList<String>();
		produceList.add("tomatoes");
		produceList.add("pepper");
		produceList.add("potatoes");
		ArrayList<String> drinksList = new ArrayList<String>();
		drinksList.add("water");
		drinksList.add("juice");
		ArrayList<ArrayList<String>> arrayList2d = new ArrayList<ArrayList<String>>();
		arrayList2d.add(bakeryList);
		arrayList2d.add(produceList);
		arrayList2d.add(drinksList);
		System.out.println(arrayList2d);
		arrayList2d.forEach(sus -> {
			switch(sus.get(0)) {
			case "pasta": 
				System.out.print("Bakery list: ");
				break;
			case "tomatoes": 
				System.out.print("Produce list: ");
				break;
			case "water": 
				System.out.print("Drinks list: ");
				break;
			default:
				System.out.print("Huh list: ");
			}
			System.out.println(sus);
		}); // uposledzony foreach

	}

}
