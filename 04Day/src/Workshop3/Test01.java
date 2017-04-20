package Workshop3;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {10,20,30,40,50};
		int sum= 0;
		for(int i=0; i<arr.length; i++){
			sum += arr[i];			
		}System.out.println("sum="+sum);
		int avg= sum/arr.length;
		System.out.println("avg="+avg);

	}

}
