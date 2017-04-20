//Student 클래스 
public class StudentBiz {
	public double getAvg(Student s){		
	
		return (s.getKor()+s.getEng()+s.getMath())/3.0;
	}
	
	public double getGrade(double avg){		
		String result = "A학점";
		return result;
	}

}


