//홍길동 aa@daum.net 184.4 67.33 남
//이순신 bb@daum.net 199.4 77.33 남
//유관순 cc@daum.net 154.4 48.33 여
public class Person {
	String name;
	String email;
	double tall;
	double weight;
	String gender;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getTall() {
		return tall;
	}

	public void setTall(double tall) {
		this.tall = tall;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}// end

// this는 heap메모리에 올라가있는 인스턴스변수의 나자신
// return name; 이건 로컬변수
// 로컬변수와 인스턴스변수 이름이 충돌날까봐 this.을 쓴다