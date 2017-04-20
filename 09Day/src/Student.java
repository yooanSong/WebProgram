
public class Student {
	private String name;
	private int math;
	private int kor;
	private int eng;
	
/*
	Student s = new Student("홍길동", 100, 100, 100);
	Student s2 = new Student("홍길동", 100, 100, 100);
	s.equals(s2)*/
	
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if(obj instanceof Student){
		Student s2= (Student)obj; //원래 타입으로 s2 형변환 한것 	
			if(name.equals(s2.name)&& math==s2.math &&kor == s2.kor && eng==s2.eng)
					//name이 String이니간 equals로 비교, math는 int니깐 ==비교
			{result = true;
			}
		}//end if
		return super.equals(obj);
	}
	
	
	
	
	
	
	public Student() {}
	public Student(String name, int math, int kor, int eng) {
		super();
		this.name = name;
		this.math = math;
		this.kor = kor;
		this.eng = eng;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	

}
