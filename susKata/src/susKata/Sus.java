package susKata;

public class Sus {

	public class RgbToHex {

	    public static String rgb(int r, int g, int b) {
	      StringBuilder hex = new StringBuilder();
	      hex.append(convertDec(r));
	      hex.append(convertDec(g));
	      hex.append(convertDec(b));
	      return hex.toString();
	    }
	    private static String convertDec(int number) {
	      StringBuilder hex = new StringBuilder();
	      if (number>0 && number<255) {
	        int result = number;
	        String raw = "";
	        do {
	          int remainder = result%16;
	            switch (remainder) {
	                case 0: case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9:
	                  raw = raw + Integer.toString(remainder);
	                case 10:
	                  raw = raw + "A";
	                  break;
	                case 11:
	                  raw = raw + "B";
	                  break;
	                case 12:
	                  raw = raw + "C";
	                  break;
	                case 13:
	                  raw = raw + "D";
	                  break;
	                case 14:
	                  raw = raw + "E";
	                  break;
	                case 15:
	                  raw = raw + "F";
	                  break;
	                default:
	                  raw = Integer.toString(remainder);
	                  raw = Character.toString(raw.charAt(1)) + Character.toString(raw.charAt(0));
	            }
	          result = result/16;
	        } while (result>0);
	        System.out.println(hex.toString());
	        hex.append(Character.toString(raw.charAt(1)) + Character.toString(raw.charAt(0)));
	        return hex.toString();
	      }
	      return number<=0 ? "00" : "FF";
	    } 
	}


}
