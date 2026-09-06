
public class NumberFromString {

	public static void main(String[] args) {
		int a = 5;
		int b = 1;
		int[] sus;
		if (a==b) {
			System.out.println(a);
		}
		else {
			sus = tablicaOdDo(a, b);
			for (int i = 0; i<sus.length; i++) {
				System.out.println(sus[i]);
			}
		}
		

	}
	public static int[] tablicaOdDo(int a, int b) {
		if (a<b) {
			return tablicaRosnaca(a, b);
		}
		return tablicaMalejaca(a, b);
	}
	public static int[] tablicaRosnaca(int a, int b) {
		int[] sus = new int[b-a+1];
		int j = 0;
		for (int i = a; i<=b; i++) {
			sus[j] = i;
			j++;
		}
		return sus;
	}
	public static int[] tablicaMalejaca(int a, int b) {
		int[] sus = new int[a-b+1];
		int j = 0;
		for (int i = a; i>=b; i--) {
			sus[j] = i;
			j++;
		}
		return sus;
	}

}
