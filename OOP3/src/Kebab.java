
public class Kebab {

	String bulka;
	String mieso;
	String surowka;
	String sos;
	Kebab() {
		
	}
	Kebab(String bulka) {
		this.bulka = bulka;
		System.out.println("suchy kebab bez niczego");
	}
	Kebab(String bulka, String mieso) {
		this.bulka = bulka;
		this.mieso = mieso;
		System.out.println("Kebab w " + bulka + " z samym " + mieso);
	}
	Kebab(String bulka, String mieso, String surowka) {
		this.bulka = bulka;
		this.mieso = mieso;
		this.surowka = surowka;
		System.out.println("Kebab w " + bulka + " z " + surowka + " i " + mieso);
	}
	Kebab(String bulka, String mieso, String surowka, String sos) {
		this.bulka = bulka;
		this.mieso = mieso;
		this.surowka = surowka;
		this.sos = sos;
		System.out.println("Kebab w " + bulka + " z " + surowka + " i " + mieso + " i sosem " + sos);
	}

}
