package Workshop3;

public class Test02 {

	public static void main(String[] args) {
		//2. 배열의 짝수번째 정수의 합을 구하세요 
		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int sum = 0;
		
		 for(int i=0; i<arr.length; i++){ 
			 if(i%2!=0){ sum += arr[i]; 
			 } 
			 }System.out.println("sum="+sum);
		
		//2배씩 커지는 공식 찾아보기
		for (int i : arr) {
			if (i % 2 != 0) {
				sum += arr[i];
			}
		}
		System.out.println("sum=" + sum);

		
		
	}//end main
}
