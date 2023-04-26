public class StarPattern {	
	public static void main(String[] args) {
	
		rightAnglePatter();
	}
	static void rightAnglePatter() {
		System.out.print("Print 1-9 in 5 row:\n");
		   int rows = 5;

		    // outer loop
		    for (int i = 1; i <= rows; ++i) {
		      // inner loop to print the numbers
		      for (int j = 1; j <= 9; ++j) {
		        System.out.print(j + " ");
		      }
		      System.out.println(" ");
		 }
   }
}