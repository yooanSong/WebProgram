
public class TestMan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Man m = new Man("홍길동",20); //인자없는 생성자는 자동으로 만들어준다 호출 
		m.setName("홍길동");

	}

}

//인자없는 생성자 : 생성자 하나도 없을 때 만들어준다 
//생성자 여러개 만들면 기본 생성자는 자동으로 생성이 안된다
//생성자가 없으면 만들어줘야 생성이 되니깐 인자없는 생성자라도 만들어 주는 건데
//생성자를 명시적으로 만들면 인자없는 생성자는 필요없어지니깐 오류가 난다 
