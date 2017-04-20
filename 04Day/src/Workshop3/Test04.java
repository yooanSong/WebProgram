package Workshop3;

public class Test04 {

	public static void main(String[] args) {
		//배열의 결과가 다음과 같이 출력되도록 하세요 
		//100 90 80 70 60 50 40 30 20 10
		int[] arr = { 10,20,30,40,50,60,70,80,90,100};
		
		//System.out.println(arr.length); //10
		for(int i=(arr.length)-1; i>=0; i--){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		for(int i=0; i<10; i++){
			System.out.print(arr[arr.length-1-i]+" ");
		}
		
	}//end main

}
