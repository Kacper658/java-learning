import java.util.ArrayList;

public class ForEachLoop {

	public static void main(String[] args) {
		// petla foreach to odpowiednik for (int i = 0; i<(dlugosc/wielkosc); i++)
		// skladnia: for (typDanych nazwaZmiennej : kolekcja)
		String[] array = {"sus1", "sus2", "sus3"};
		for (String i : array) {
			System.out.println(i);
		}
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
		for (ArrayList<String> i : arrayList2d) {
			for (String j : i) {
				System.out.println(j);
			}
		}

	}

}
