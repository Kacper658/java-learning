package sus1;

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.*;

public class bruh {

	public static void main(String[] args) {
		// https://www.youtube.com/watch?v=xk4_1vDrzzo
		// podstawy
		System.out.println("Ala ma kota");
		// println - print z nowa linia
		System.out.print("amogus, fortnite\n");
		// \n przykladowy "escape sequence"
		System.out.print("\t\tAla ma kota");
		// \t tab escape sequence (sekwencja wyjscia???)
		System.out.println("Ala ma kota (\"\")");
		// \" daje cudzyslow itd
		System.out.println("\\\\");
		// To jest komentarz
		/*fortnite
		 * taki dlugi komentarz 
		 * bruh
		 * sus
		 */
		// sysout to skrot do System.out.println() (trzeba nacisnac ctrl + spacja)
		// --------------------------------
		// zmienne
//		int x; // deklaracja zmiennej
//		x = 123; // przypisanie wartosci do zmiennej
//		int y = 123; // inicjacja zmiennej
//		System.out.println(x);
//		System.out.println("Mój numer to: " + x); // tak jak console.log i document.write w js
//		long z = 123456789897654335L; // z jakiegos powodu trzeba pisac L na koncu wartosci w zmiennej long
//		byte v = 100; // typ zmiennej byte moze przechowywac tylko do liczby 127 (optymalizacja goes harddd)
//		float h = 3.14f; // z jakiegos powodu trzeba pisac f (podobnie jak przy long)
//		double b = 3.14665656565; //double to float ale wieksza precyzja i nie trzeba pifac f (XD)
//		boolean l = true; // tylko do true albo false
//		char symbol = '@'; // trzeba robic ''
//		String name = "suus@#$%^&"; // string to data type wiec piszemy z duzej
//		System.out.println(name);
//		String sus1 = "water";
//		String sus2 = "acid";
//		String temp;
//		temp=sus1;
//		sus1=sus2;
//		sus2=temp;
//		System.out.println("sus1: " + sus1);
//		System.out.println("sus2: " + sus2);
		
		// dialog z uzytkownikiem przez konsole
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("podaj swoj pesel ");
//		String name1 = scan.nextLine();
//		System.out.println("Witaj obywatelu nr. " + name1);
		// https://youtu.be/xk4_1vDrzzo?t=2345 39:05
		
		
		
//		System.out.print("Podaj nr. weryfikacyjny : ");
//		int numer = scan.nextInt();
//		System.out.println("ok " + numer);
//		// skanuje i wypisuje odpowiedz z konsoli
//		scan.nextLine();
//		// resetuje zmienna scan (bo nextInt() zostawia \n (enter) a nextLine czyta to jako wcisniecie enter)
//		
//		System.out.println("sus: ");
//		String pyt1 = scan.nextLine();
//		System.out.println("Odpowiedz na pytanie weryfikacyjne: " + pyt1);
		// sprawdzenie czy zmienna rzeczywiscie jest pusta
		
		// operandy i operatory
//		double sus3 = 20;
//		sus3 = (double) sus3 / 3;
//		System.out.println(sus3);
		// dokladnie to samo co w js tylko trzeba pamietac o typie zmiennej
		
		// podstawowy program w Graphic User Interface
		
//		String sus4 = JOptionPane.showInputDialog("podaj nazwe uzytkownika");
//		// okno dialogowe
//		JOptionPane.showMessageDialog(null, "witaj " + sus4);
//		// wypisuje wpisana wartosc w oknie dialogowym
//		
//		int sus5 = Integer.parseInt(JOptionPane.showInputDialog("podaj kod dostepu"));
//		// okno dialogowe (dzialaja w nim tylko liczby)
//		JOptionPane.showMessageDialog(null, "kod: " + sus5 + " ?");
		
		/* JOptionPane ma pare metod
		 * - input
		 * - message
		 * - confirm
		 *  pierwsza opcja to typ GUI (wyglad okienka)(domyslnie jest null), druga opcja to tytul
		 */ 
//		
//		// https://youtu.be/xk4_1vDrzzo?t=3145 52:25
//		
//		double pi = Double.parseDouble(JOptionPane.showInputDialog("podaj liczbe pi"));
//		JOptionPane.showMessageDialog(null, "liczba pi to: " + pi);
		// okno dialogowe z wartosciami po przecinku
		
		// https://youtu.be/xk4_1vDrzzo?t=3304
		
		// Metody Math
		
//		JOptionPane.showMessageDialog(null, "Wyliczanie przeciwprostokatnej");
//		double x = Double.parseDouble(JOptionPane.showInputDialog("podaj 1 przyprostokatna"));
//		double y = Double.parseDouble(JOptionPane.showInputDialog("podaj 2 przyprostokatna"));
//		double sus1 = Math.max(x, y); // porownanie 2 wartosci ktora jest wieksza
//		double sus2 = Math.abs(y); // wartosc bezwzgledna
//		double sus3 = Math.sqrt(y); // pierwiastek z podanej liczby
//		double sus4 = Math.round(y); // zaokraglenie (tak jak w js zaokragla tak zeby nie bylo nic po przecinku)
//		double sus5 = Math.ceil(y); // zaokraglenie do nastepnej liczby
//		double sus6 = Math.floor(y); // zaokraglenie do nizszej liczby
		// wyliczanie przeciwprostokatnej
//		double z = Math.sqrt(x*x+y*y);
//		
//		JOptionPane.showMessageDialog(null, "Przeciwprostokatna wynosi: " + z);
		
		// https://youtu.be/xk4_1vDrzzo?t=3680
		
		// generowanie liczb pseudolosowych
		// z js:
//		double x = Math.random();
//		System.out.println(x);
		// niestety Math.random() jest mniej zoptymalizowane i uzywamy go tylko wtedy kiedy jest to konieczne
//		Random random = new Random();
//		
//		int x = random.nextInt(6)+1;
//		double y = random.nextDouble(0.1);
//		boolean z = random.nextBoolean();
//		System.out.println(y);
		
		// https://youtu.be/xk4_1vDrzzo?t=3949 if
		
		// prosta instrukcja warunkowa if
//		int sus1 = 20;
//		
//		int x = JOptionPane.showConfirmDialog(null, "okok");
//		
//		if (x==0) {
//			System.out.println("tak");
//		}
//		else if (x==1) {
//			System.out.println("nie");
//		}
//		else if (x<0 || x>2) {
//			System.out.println("nie wybrano odpowiedzi");
//		}
//		else {
//			System.out.println("sus");
//		}
		
		// https://youtu.be/xk4_1vDrzzo?t=4359
		
		// instrukcja warunkowa switch
//		String sus1 = JOptionPane.showInputDialog("sus?");
//		String sus2 = "amogus";
//		String sus3 = "imposter";
//		String sus4 = "fortnite";
//		String sus5 = "vent";
//		String sus6 = "scar";
//		String sus7 = "sus";
//		
//		switch (sus1) {
//		case sus2: System.out.println("Sus word is: " + sus2);
//		break;
//		case sus3: System.out.println("Sus word is: " + sus3);
//		break;
//		case sus4: System.out.println("Sus word is: " + sus4);
//		break;
//		case sus5: System.out.println("Sus word is: " + sus5);
//		break;
//		case sus6: System.out.println("Sus word is: " + sus6);
//		break;
//		case sus7: System.out.println("Sus word is: " + sus7);
//		break;
//		default: System.out.println("This word is NOT SUS(WTF!!!!!!)!!!!!!!!!!!!");
//		}
		
		// ogolnie to powinno dzialac ale nie dziala bo mam jakies errory z JRE
		
		// operatory logiczne
		// - AND (&&)
		// - OR (||)
		// - NOT (!) - odwraca boolean
		// - metoda equals (.equals()) zwraca boolean w zaleznosci czy wpisany string jest taki sam co ten do ktorego sie odwoluje metoda
		
//		Scanner scanner = new Scanner(System.in);
//		String in = scanner.next();
//		if (in.equals("q") || in.equals("Q")) {
//			System.out.println("you left");
//		}
//		else {
//			System.out.println("You stay");
//		}
//		scanner.close();
		// https://youtu.be/xk4_1vDrzzo?t=4948
		// to samo:
		
//		Scanner scanner = new Scanner(System.in);
//		String in = scanner.next();
//		if (!in.equals("q") && !in.equals("Q")) {
//			System.out.println("you stay");
//		}
//		else {
//			System.out.println("You left");
//		}
//		scanner.close();
		// experiment: 
//		if (!true) {
//			System.out.println("sus");
//		}
//		else {
//			System.out.println("not sus");
//		}
		
		//petla while
		
//		String sus1 = "";
		
//		while(false) {
//			System.out.println("sus");
//		}
		// while(false){} to wg kompilatora martwy kod (XD)
		// martwy kod to tez wg eclipse czesc if ktora nigdy sie nie wykona (np. kiedy w warunek wpiszemy boolean)
		
//		while (sus1.isBlank()) {
//			sus1 = JOptionPane.showInputDialog("Wpisz to co chcesz wyswietlic:");
//		}
//		JOptionPane.showMessageDialog(null, sus1);
		// petla ktora zakonczy sie kiedy wpiszemy wartosc do zmiennej
		// istnieje tez petla while ktora wykona sie minimum raz:
//		do{
//		sus1 = JOptionPane.showInputDialog("Wpisz to co chcesz wyswietlic:");
//		}while (sus1.isBlank());
//		JOptionPane.showMessageDialog(null, sus1);
		
		// petla for (LETS GOOOOOOO!!!!!) (to samo co w js)	
//		for (int i = 20; i>=1; i--) {
//			System.out.println("sus");
//		}
		// petla ktora wyswietla dokladnie 19 razy sus
//		for (int i = 0; i<=20; i++) {
//			System.out.println(i);
//		}
		// petla ktora liczy od 0 do 20
// 		System.out.println(i); to nie zadziala bo zmienna zadeklarowana w petli for nie wychodzi poza nia
		// experiment zrobienia while(true) z petli for (dziala, nie ma roznicy miedzy nimi):
//		for (; true;) {
//			System.out.println("sus");
//		}
		
		// https://youtu.be/xk4_1vDrzzo?t=5544 (zagniezdzone petle?)
		
		// petla zagniezdzona - petla w petli
		
//		String znak = JOptionPane.showInputDialog("Znak: ");
//		int wiersze = Integer.parseInt(JOptionPane.showInputDialog("Wiersze: "));
//		int kolumny = Integer.parseInt(JOptionPane.showInputDialog("Kolumny: "));
//		
//		for (int i = wiersze; i>=0; i--) {
//			System.out.println();
//			for (int a = kolumny; a>=0; a--) {
//				System.out.print(znak);
//			}
//		}
		// https://youtu.be/xk4_1vDrzzo?t=5917
		// arrays/tablice
		
//		String[] x = {"sus1", "sus2", "sus3"};
//		System.out.println(x[1]); //expected output: "sus2"
		// tak jak w js tablice liczy sie od 0 a elementy normalnie
		
//		String[] x = new String[5];
//		x[0] = "sus1";
//		x[1] = "sus2";
//		x[2] = "sus3";
//		x[3] = "sus4";
//		x[4] = "sus5";
//		System.out.println(x[4]); expected output: "sus5"
		// inny sposob na deklarowanie tablicy
		// cwiczenie z tablica:
//		int ilosc = Integer.parseInt(JOptionPane.showInputDialog("Liczba skladnikow:"));
//		String[] x = new String[ilosc];
//		int bruh = 1;
//		for (int i = 0; i<x.length; i++) {
//			x[i] = JOptionPane.showInputDialog("Podaj skladnik nr. " + bruh);
//			bruh++;
//			System.out.println(x[i]);
//		}
		
		// tablice 2d (WTF!!!!) - tablica tablic
//		int wiersze = Integer.parseInt(JOptionPane.showInputDialog("Wiersze: "));
//		int kolumny = Integer.parseInt(JOptionPane.showInputDialog("Kolumny: "));
//		int w = 1;
//		int k = 1;
//		String[][] rc = new String[kolumny][wiersze];
//		for (int i = 0; i<wiersze; i++) {
//			System.out.println();
//			System.out.print("wiersz nr. " + w + ": ");
//			for (int a = 0; a<kolumny; a++) {
//				rc[a][i] = JOptionPane.showInputDialog("Wartosc w: " + w + " wierszu i w: " + k + " kolumnie");
//				k++;
//				System.out.print(rc[a][i] + ", ");
//			}
//			k=1;
//			w++;
//		}
		// mozna tez przypisywac tablice 2d na inny sposob tak jak tablice zwykle np.
//		String[][] sus = {{"sus00", "sus01"}, {"sus10", "sus11"}};
		
		/*
		 * metody do zmiennej String:
		 * - .equals() - zwraca boolean 
		 * - .equalsIgnoreCase() - zwarca true nawet jesli wartosci sa tesame ale maja inne case (uppercase, lowercase)
		 * Rozpatrujace String jako tablice:
		 * - .length - zwraca dlugosc stringa w liczbie (Integer)
		 * - .charAt() - zwraca wybrana litere
		 * - .indexOf() - zwraca PIERWSZY indeks wpisanej w nawias litery
		 * Inne: 
		 * - .isEmpty() - zwraca boolean
		 * - .toUpperCase() - zwraca ta sama ale wypisana wielkimi literami wartosc (String)
		 * - .toLowerCase()
		 * - .trim() - usuwa spacje, taby przed i po stringu
		 * - .replace() - zmienia 1 litere (1 parametr), na inna (2 parametr)
		 */
		// https://youtu.be/xk4_1vDrzzo wrapper class (klasy opakowujące, osłonowe)
		// klasy opakowujace to zmienne enkapsulowane (autoboxing) w obiekt (uzywany w np. ArrayList)
		// przy odwolywaniu do tej klasy nastepuje dekapsulacja (unboxing), dzialaja wlasciwie tak jak zwykle zmienne, ale sa wolniejsze i moga byc na nich stosowane metody
		// dla int - Integer, dla char - Character, dla reszty nazwa ta sama, tylko z duzej litery
		
		// https://youtu.be/xk4_1vDrzzo?t=7595
		// arraylist (lista tablic) - collection (kolekcja) operujaca na obiektach (wrapper class)
		
//		ArrayList<String> sus = new ArrayList<String>();
//		sus.add("sus1");
//		sus.add("sus2");
//		sus.add("sus3");
//		// normalnie dla tablic uzywamy .length() ale dla ArrayList uzywamy .size()
//		System.out.println(sus.size()); expected output: 3
//		for (int i = sus.size(); i>0; i--) {
//			System.out.println(sus.get(i-1));
//		}
//		ArrayList<String> sus = new ArrayList<String>();
//		int bruh = 1;
//		while(true) {
//			sus.add(JOptionPane.showInputDialog("Wpisz skladnik nr: " + bruh));
//			if (sus.get(bruh-1)==null) {
//				int confirm = JOptionPane.showConfirmDialog(null, "Czy chcesz zakończyć?");
//				if (confirm==0) {
//					break;
//				}
//			}
//			else {
//				System.out.println(sus.get(bruh-1));
//				bruh++;
//			}
//		}
		// 2d arraylist
		
//		ArrayList<String> sus1 = new ArrayList<String>();
//		sus1.add("sus");
//		sus1.add("bruh");
//		sus1.add("fortnit");
//		ArrayList<String> sus2 = new ArrayList<String>();
//		sus2.add("sus");
//		sus2.add("bruh");
//		sus2.add("fortnit");
//		ArrayList<String> sus3 = new ArrayList<String>();
//		sus3.add("sus");
//		sus3.add("bruh");
//		sus3.add("fortnit");
//		ArrayList<ArrayList<String>> sus0 = new ArrayList<ArrayList<String>>();
//		sus0.add(sus1);
//		sus0.add(sus2);
//		sus0.add(sus3);
//		
//		System.out.println(sus0.get(0).get(1));
//		elementy do glownej tablicy nalezy dodawac po zadeklarowaniu reszty tablic
		
		// petla for-each - enchanced for loop
		
//		String[] sus2 = {"bruh", "huh", "fortn"};
//		ArrayList<String> sus1 = new ArrayList<String>();
//		sus1.add("huh");
//		sus1.add("huh");
//		sus1.add("amogus");
//		for(String i : sus1) {
//			System.out.println(i);
//		}
		// for-each przypisuje do zmiennej utworzonej w petli stringi z tablicy lub innej kolekcji i powtarza sie dokladnie tyle ile elementow w kolekcji
		// w tej petli nie mozna przypisywac nic do rozpatrywanej w niej tablicy (w czasie trwania loopa staje sie non-flexible)
		
		// metody (funkcje w js)
		// https://youtu.be/xk4_1vDrzzo?t=8489
		
//		double pierwiastek = 0.534;
//		witaj("buh", pierwiastek);
		
//		int x = Integer.parseInt(JOptionPane.showInputDialog("wpisz liczbe nr. 1"));
//		int y = Integer.parseInt(JOptionPane.showInputDialog("wpisz liczbe nr. 2"));
//		JOptionPane.showMessageDialog(null,x + " + " + y + " = " + oblicz(x, y));
//		
		
		// Przepełnione metody - metody o tej samej nazwie ale innych parametrach wejsciowych
		// mozna je odroznic poprzez podpis metody = nazwa metody + parametry
//		System.out.println(dodaj(1.4646, 7.4242424, 5));
//		https://youtu.be/xk4_1vDrzzo?t=9525
		// printf
		// %d - decimal (int)
		// %c - character (char)
		// %s - string
		// %f - float, double
		// width - dajemy przed cs (conversion character), daje spacje przed wypisaniem 2 argumentu
		// jesli wpiszemy width ujemny to spacje pojawia sie po wypisaniu cs
		// precision field - stosowany tylko do cs(f) okresla ile liczb po przecinku chcemy wyswietlic
		// flagi np. , albo 0
		
//		System.out.printf(" format string %.2f", 123.0);
		
		// final keyword
		// final czyni stałą ze zmiennej przy deklaracji
		// zazwyczaj stałe nazywa sie duzymi literami
		
//		final double PI = 3.14;
//		// nie mozemy przypisac innej wartosci do stalej
////		PI = 5;
//		System.out.println(PI);
		// CZESC PROGRAMOWANIA OBIEKTOWEGO-------------------------------------------------------------------------
		// obiekty - klasa zawierająca atrybuty i metody
		// w innym projekcie
		// https://youtu.be/xk4_1vDrzzo?t=11545
		// https://youtu.be/xk4_1vDrzzo?t=12244
		System.out.println(125/16);
		
	} // ---------- koniec klasy ---------------------
	
	
//	static void witaj(String sus, double liczba) {
//		System.out.println(sus + " nr. " + liczba);
//	}
	
//	static int oblicz(int f, int l) {
//		return f+l;
//	}
	// Przepełnione metody - metody o tej samej nazwie ale innych parametrach wejsciowych
			// mozna je odroznic poprzez podpis metody = nazwa metody + parametry
			
	
//	static int dodaj(int x, int y) {
//		return x+y;
//	}
//	static int dodaj(int x, int y, int z) {
//		return x+y+z;
//	}
//	static int dodaj(int x, int y, int z, int a) {
//		return x+y+z+a;
//	}
//	static double dodaj(double x, double y) {
//		return x+y;
//	}
//	static double dodaj(double x, double y, int z) {
//		return x+y+z;
//	}
	
}
