
public class self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num = null;
		num = new int[3];
		
		int [] num2= {1,2,3,4};
		for (int i : num2) {
			System.out.println(i);
		}
		
		
		String[] names=new String[2];
		System.out.println(names[0]);
		System.out.println(names[1]);
		
		names[0]="홍길동";
		names[1]="이순신";
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(">"+names[i]);
		}
		for (String s : names) {
			System.out.println(s);
		}
		

	}//end main

}//end class