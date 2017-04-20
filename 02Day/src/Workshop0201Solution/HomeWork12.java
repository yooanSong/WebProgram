package Workshop0201Solution;
import java.util.Scanner;

class HomeWork12 {
	public static void main(String[] args) {
		int i=3,count=0;	
		do{
			i+=3;
			if(i%3==0){
				count++;
			}
		} while(i<=100);
			System.out.println();
			System.out.println("3배수 갯수: "+count);
	}
}
