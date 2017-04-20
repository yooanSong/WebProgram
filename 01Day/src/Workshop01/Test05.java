package Workshop01;

public class Test05 {
	public static void main(String [] args){
		int fahrenheit =100;
		//float celcius=(5/9.0f*(fahrenheit-32));
		float celcius=(float)(5/9.0*(fahrenheit-32));
		System.out.println("Fahrenheit:"+fahrenheit); 
		System.out.println("Celcius:"+celcius);
		//Fahrenheit:100
		//Celcius:37.77778
		
		/*int와 float을 연산한 것 float표시를 안해주면 
		double로 자동 설정되므로
		에러가 났다 그래서 꼭 float임을 명시해줘야 한다 
		1. float celcius=(5/9.0f*(fahrenheit-32));
		2. float celcius=(float)
		   (5/9.0*(fahrenheit-32));*/
	}

}
