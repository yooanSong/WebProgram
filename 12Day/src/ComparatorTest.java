import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name +"\t"+this.age;
	}

}// end class

// Person클래스의 age순으로 정렬하는 클래스
class PersonAgeOrder implements Comparator<Person> {
	
	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		int result = -1;
		if(o1.age >=o2.age) result =1; //오름차순
		//if(o1.age >=o2.age) result =-1; //내림차순
		return result;
	}

}//end compare

public class ComparatorTest {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<>();
		list.add(new Person("이순신1", 33));
		list.add(new Person("이순신2", 11));
		list.add(new Person("이순신3", 77));
		list.add(new Person("이순신4", 44));
		list.add(new Person("이순신5", 7));
		list.add(new Person("이순신6", 55));
		list.add(new Person("이순신7", 45));

		// 배열 유틸리티: Array 클래스
		// 컬렉션 유틸리티 : Collections클래스
		
		Collections.sort(list, new PersonAgeOrder());
		
		for (Person person : list) {
			System.out.println(person);
		}

	}// end main

}

