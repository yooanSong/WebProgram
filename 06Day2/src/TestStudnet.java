
public class TestStudnet {

	public static void main(String[] args) {
		Student s = new Student("홍길동", 100, 100, 100);
		Student s2 = new Student("이순신", 70, 80, 90);
		Student s3 = new Student("유관순", 70, 80, 90);

		
		//평균
		StudentBiz biz = new StudentBiz(); //사용하려면 객체 생성해야함 
		double d = biz.getAvg(s);  //사용한 예 
		String grade = biz.getGrade(d);
		double d2 = biz.getAvg(s2);
		String grade2 = biz.getGrade(d2);

	}

}
