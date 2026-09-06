
public class Main {

	public static void main(String[] args) {
		Object adres = new Adres("Mieroszyno", "84-100", "Widokowa", 14);
		System.out.println(adres);
		Object konkaj = new Osoba("Kajetan", "Konkol", 1989, "Mrzezino", "69-420", "Pogodna", 13);
		System.out.println(konkaj);
		Object zyleta = new Osoba("Szymon", "Klawikowski", 2005, (Adres)adres);
		System.out.println(zyleta);
		char a = '1';
		System.out.println(Character.isDigit(a));
	}

}
