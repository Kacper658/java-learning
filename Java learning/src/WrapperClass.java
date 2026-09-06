
public class WrapperClass {

	public static void main(String[] args) {
		
		// Istnieja referencyjne odpowiedniki prymitywnych typow danych, ktore maja uzyteczne metody. Sa to tzw. "wrapper class" (klasy opakowujace)
		
		// autoboxing - automatyczna konwersja z prymitywnego typu danych do jego referencyjnego odpowiednika (klasy opakowujacej)
		// unboxing - automatyczna konwersja z klasy opakowujacej do prymitywnego typu danych
		
		// przyklady urzycia klas opakowujacych
		Boolean b = true;
		Character c = '@';
		Integer i = 123;
		Double d = 3.14;
		
		if (b) System.out.println("b jest true");
		
		// nalezy pamietac ze klasy opakowujace sa o wiele wolniejsze od prymitywnych typow danych

	}

}
