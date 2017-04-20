import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Date클래스
		Date d = new Date();
		System.out.println(d); //d.toString() object객체에서 오버라이딩 한것, 실제 데이터 나옴 
		System.out.println(d.getYear()); //Deprecated 됬다는 의미 실행은 되지만 곧 없어질 예정 
		
		System.out.println("=============");
		//날짜 포맷
		SimpleDateFormat f = new SimpleDateFormat("yyyy년MM월dd일(a) HH:mm:ss");
		String xxx = f.format(new Date());
		System.out.println(xxx);

		
		
		
		System.out.println("=============");
		//2.Calendar 클래스
		Calendar cal = Calendar.getInstance(); //get메서드를 cal에 저장하고 시스템 시간을 출력 
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1); //배열로 관리하는데 0번째가 1월이니깐 +1해야함 
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		
		System.out.println(cal.get(Calendar.HOUR_OF_DAY)); //시
		System.out.println(cal.get(Calendar.MINUTE)); //분
		System.out.println(cal.get(Calendar.SECOND)); //초
		
		System.out.println("=============");
		//특정 날짜 설정
		Calendar cal2= Calendar.getInstance();
		cal2.set(2017, 06, 20);		
		System.out.println(cal2.get(Calendar.YEAR));
		System.out.println(cal2.get(Calendar.MONTH)+1);
		System.out.println(cal2.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("=============");
		//calendar 날짜포맷 
		SimpleDateFormat f2 = new SimpleDateFormat("yyyy년MM월dd일(a) HH:mm:ss");
		String xxx2 = f.format(cal.getTime());
		System.out.println(xxx2);



		


	}//end main

}
