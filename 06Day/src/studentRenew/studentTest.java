package studentRenew;

public class studentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student[] = new Student[3];
		student[0] = new Student("Kim", 100, 90, 95, 89);
		student[1] = new Student("Lee", 60, 70, 99, 98);
		student[2] = new Student("Park", 68, 86, 60, 40);
		
		System.out.println("Kim 평균:"+student[0].getAvg()+"\t"+
				"학점:"+student[0].getGrade());
		System.out.println("Lee 평균:"+student[1].getAvg()+"\t"+
				"학점:"+student[1].getGrade());
		System.out.println("Park 평균:"+student[2].getAvg()+"\t"+
				"학점:"+student[2].getGrade());
		
		

	}//end main

}
