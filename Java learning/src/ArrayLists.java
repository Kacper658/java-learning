import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		// ArrayList - rozszerzalna tablica przechowujaca tylko referencyjne typy danych
		
		ArrayList<Double> stale = new ArrayList<Double>();
		stale.add(Math.PI);
		stale.add(Math.E);
		stale.add(null);
		
		stale.set(0, 3.14);
		
		System.out.println(stale.get(0));
		System.out.println(stale);
		
		stale.remove(null);
		stale.remove(0);
		
		System.out.println(stale);
		
		stale.clear();
		
		System.out.println(stale.toString());
		

	}

}
