package com.stu;

public class StudentTest {

	public static void main(String[] args) {
		// 3개의 객체 중 가장 큰 신장과 몸무게 나이의 평균을 구한다
		Student studentArray[] = new Student[3];
		studentArray[0] = new Student("홍길동", 15, 170, 80);
		studentArray[1] = new Student("한사람", 13, 180, 70);
		studentArray[2] = new Student("임걱정", 16, 175, 65);

		double totalAge = 0.0;
		double totalHeight = 0.0;
		double totalWeight = 0.0;

		int maxAgeIndex = 0;
		int minAgeIndex = 0;

		int maxHeightIndex = 0;
		int minHeightIndex = 0;

		int maxWeightIndex = 0;
		int minWeightIndex = 0;

		System.out.println("이름 \t 나이 \t 신장 \t 몸무게");

		for (int i = 0; i < studentArray.length; i++) {
			System.out.println(studentArray[i].studentInfo());

			totalAge += studentArray[i].getAge();
			totalHeight += studentArray[i].getHeight();
			totalWeight += studentArray[i].getWeight();

//15 13 16 // 170 180 175 // 80 70 65
			if (maxAgeIndex == 0 || studentArray[maxAgeIndex].getAge() < studentArray[i].getAge()) {
				maxAgeIndex = i;
			}
			if (minAgeIndex == 0 || studentArray[minAgeIndex].getAge() > studentArray[i].getAge()) {
				minAgeIndex = i;
			}
			
			if (maxHeightIndex == 0 || (studentArray[maxHeightIndex].getHeight() < studentArray[i].getHeight())) {
				maxHeightIndex = i;
			}
			if (minHeightIndex == 0 || (studentArray[minHeightIndex].getHeight() > studentArray[i].getHeight())) {
				minHeightIndex = i;
			}// 0인 홍길동 나와야 하는데 2인 임걱정나옴 
			
			
			if (maxWeightIndex == 0 || (studentArray[maxWeightIndex].getWeight() < studentArray[i].getWeight())) {
				maxWeightIndex = i;
			}// 0인 홍길동 나와야 하는데 1인 한사람 나옴 
			if (minWeightIndex == 0 || (studentArray[minWeightIndex].getWeight() > studentArray[i].getWeight())) {
				minWeightIndex = i;
			}
			
			System.out.println();
			System.out.println(minHeightIndex);
			System.out.println(maxWeightIndex);

		}
		
		
		System.out.println();
		System.out.printf("나이평균 : %.3f \n", totalAge / 3);
		System.out.printf("신장평균 : %.3f \n", totalHeight / 3);
		System.out.printf("몸무게평균 : %.3f \n", totalWeight / 3);

		System.out.println();
		System.out.println("나이가 가장 많은 학생 :" + studentArray[maxAgeIndex].getName());
		System.out.println("나이가 가장 적은 학생 :" + studentArray[minAgeIndex].getName());
		System.out.println("신장이 가장 큰 학생 :" + studentArray[maxHeightIndex].getName());
		System.out.println("신장이 가장 작은 학생 :" + studentArray[minHeightIndex].getName());
		System.out.println("몸무게가 가장 많이 나가는 학생 :" + studentArray[maxWeightIndex].getName());
		System.out.println("몸무게가 가장 적게 나가는 학생 :" + studentArray[minWeightIndex].getName());

	}// end main

}
