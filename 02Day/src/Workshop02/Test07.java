package Workshop02;

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int temp = Integer.parseInt(args[0]);
	      int result = 0;
	      for (int i = 1; i <= 100; i++) {
	         if (i % temp == 0) {
	            System.out.print(i + " + ");
	            result += i;
	         }
	      }
	      System.out.println("\n = " + result);
		
		
		
	}// end main

}
