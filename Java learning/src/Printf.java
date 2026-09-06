
public class Printf {

	public static void main(String[] args) {
		// System.out.printf - metoda używana do formatowania i wyświetlania tekstu w konsoli
		// przyjmuje 2 argumenty - wyświetlany tekst (String) i dowolną wartość (dokumentacja)
		// za pomocą specjalnych ciągów znaków, możemy formatować tekst:
		// % [flags] [.precision] [width] conversion-character
		// zeby wyswietlic drugi argument potrzebujemy pasującego znaku konwertującego
		System.out.printf("This is %d String", 123);
		
		System.out.printf("To jest znak nowej linii: %n", null);
		System.out.printf("boolean: %b%n", true);
		System.out.printf("String: %s%n", "przyklad");
		System.out.printf("char: %c%n", '$');
		System.out.printf("int: %d%n", 10);
		System.out.printf("long: %d%n", 11L);
		System.out.printf("float: %f%n", 12.0f);
		System.out.printf("double: %f%n", 12.0d);
		
		// szerokość: ilość znaków którą wyświetli jako wartosc (jesli bedzie wiecej znakow w wartosci to nic dodatkowo nie wypisuje, w przeciwnym wypadku przed wartoscia wypisuje spacje)
		System.out.printf("String: %10s%n", "przyklad");
		
		// precyzja: ile zer ma sie wyswietlac po przecinku przy liczbie typu float lub double
		System.out.printf("float: %.2f%n", 12.0f);
		
		// flagi: formatuje tekst w zależności od uzytego znaku:
		// - : dziala z szerokoscia, wypisuje spacje po wartosci zamiast przed
		// + : wypisuje + albo - przed wartoscia liczbowa
		// 0 : dziala z szerokoscia i tylko liczbowymi wartosciami, wypisuje zera zamiast spacji
		// , : separator grupujący, jesli liczba jest wieksza lub rowna 1000
		System.out.printf("float: %.2f%n", 12.0f);
	}

}
