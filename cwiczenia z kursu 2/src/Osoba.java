
public class Osoba {
	private String imie;
	private String nazwisko;
	private final int rokUrodzenia;
	private Adres adres;
	public Osoba(String imie, String nazwisko, int rokUrodzenia, Adres adres) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.rokUrodzenia = rokUrodzenia;
		this.adres = adres;
	}
	public Osoba(String imie, String nazwisko, int rokUrodzenia, String miejscowosc, String kodPocztowy, String nazwaUlicy, int nrDomu) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.rokUrodzenia = rokUrodzenia;
		this.adres = new Adres(miejscowosc, kodPocztowy, nazwaUlicy, nrDomu);
	}
	public String toString() {
		return "Dane osoby: " + imie + " " + nazwisko + " rok urodzenia: " + rokUrodzenia + " adres: " + adres;
	}
}
