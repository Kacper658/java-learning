
public class StringMethods {

	public static void main(String[] args) {
		String nick = "Prox";
		
//		boolean result = nick.isEmpty();
//		boolean result = nick.equals("prox");
//		boolean result = nick.equalsIgnoreCase("prox");
//		int result = nick.length();
//		int result = nick.indexOf(0);
//		char result = nick.charAt(0);
//		String result = nick.toUpperCase();
//		String result = nick.toLowerCase();
//		String result = nick.trim(); // usuwa wszystkie spacje
		String result = nick.replace('r', 'x');
		
		
		
		System.out.println(result);

	}

}
