package kata2;

public class whatever {

	public static void main(String[] args) {
		int[] sus = {1,100,50,-51,1,1};
		int bruh = findEvenIndex(sus);
	}
		  public static int findEvenIndex(int[] arr) {
		    int l;
		    int r;
		    for (int i = 1; i<arr.length; i++) {
		      l=countLeft(i, arr);
		      r=countRight(i, arr);
		      if (l==r) {
		        return i;
		      }
		    }
		    return -1;
		  }
		  public static int countLeft(int index, int[] array) {
		    if (index!=0) {
		      int count = 0;
		      for (int i = index; i>0; i--) {
		        count+=array[i];
		      }
		      return count;
		    }
		    return 0;
		  }
		  public static int countRight(int index, int[] array) {
		    if (index!=array.length-1) {
		      int count = 0;
		      for (int i = index; i<array.length; i++) {
		        count+=array[i];
		      }
		      return count-1;
		    }
		    return 0;
		  }
}
