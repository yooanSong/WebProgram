
public class TestStudent {

	public static void main(String[] args) {
		
		Student s = new Student("홍길동", 30, "서울");
		//인자있는 생성자 객체 
		Student s2 = new Student("이순신", 44, "전라");
		
		//int[] num = new int[2];
		//num[0] =10;
		//Student [] ss = new Student[2];
			
		Student[] ss= {new Student("홍길동", 30, "서울"),
				new Student("이순신", 44, "전라")};
		for (Student stu : ss) {
			System.out.println(stu.getName()+"\t"+stu.getAge());
		}
		Student s1=ss[0];
	}

}
