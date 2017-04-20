package Workshop3;

public class Test03 {

	public static void main(String[] args) {
		//3. 2차원 배열 arr2의 총합과 평균 구하세요 
		int[][] arr2={
				{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
		};//end int
		
		int total =0,count=0;
		for(int[] is: arr2){
			for(int i : is){				
				total += i;	
				count++;
			}
		}
		System.out.println("total="+total);
		double avg = (double)total/(double)count;
		//실수형으로 출력하려면 각각에 double을 줘야한다!! 
		System.out.println("average="+avg);
		
	}//end main

}
