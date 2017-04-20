package com.stu.renew;

import java.util.Arrays;

//import school.Student;

public class StudentTest01 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Student01[] class001 = { new Student01("홍길동", 14, 170, 80), new Student01("한사람", 15, 180, 70),
            new Student01("임걱정", 17, 175, 65) };
     
      int[] temp = new int[class001.length];
      for (Student01 student : class001) {
         System.out.println(student.studentInfo());
      }
     
      int age_total = 0;
      for (Student01 student : class001) {
         age_total += student.getAge();
      }
      System.out.print("나이 평균은  ");
      System.out.printf("%.3f \n", age_total / (class001.length * 1.0f));

      int height_total = 0;
      for (Student01 student : class001) {
         height_total += student.getHeight();
      }
      System.out.print("신장 평균은  ");
      System.out.printf("%.3f \n", height_total / (class001.length * 1.0f));

      int weight_total = 0;
      for (Student01 student : class001) {
         weight_total += student.getWeight();
      }
      // Student[] tempclass = new Student[class001.length];

      // System.out.println("몸무게 평균은 " + (weight_total / (class001.length *
      // 1.0f)));
      System.out.print("몸무게  평균은  ");
      System.out.printf("%.3f \n", weight_total / (class001.length * 1.0f));

      System.out.println("-----------------");
      for (int i = 0; i < class001.length; i++) {
         temp[i] = class001[i].getAge();
      }
      Arrays.sort(temp);
      for (int i = 0; i < class001.length; i++) {
         if (temp[0] == class001[i].getAge())
            System.out.println("나이가 제일 적은 사람은 " + class001[i].getName());
         if (temp[class001.length - 1] == class001[i].getAge())
            System.out.println("나이가 제일  많은 사람은 " + class001[i].getName());

      }
      System.out.println("-----------------");

      for (int i = 0; i < class001.length; i++) {
         temp[i] = class001[i].getWeight();
      }

      Arrays.sort(temp);
      for (int i = 0; i < class001.length; i++) {
         if (temp[0] == class001[i].getWeight())
            System.out.println("몸무게가 제일 적은 사람은 " + class001[i].getName());
         if (temp[class001.length - 1] == class001[i].getWeight())
            System.out.println("몸무게가 제일  많은 사람은 " + class001[i].getName());

      }

      System.out.println("-----------------");

      for (int i = 0; i < class001.length; i++) {
         temp[i] = class001[i].getHeight();
      }

      Arrays.sort(temp);
      for (int i = 0; i < class001.length; i++) {
         if (temp[0] == class001[i].getHeight())
            System.out.println("키가 제일 적은 사람은 " + class001[i].getName());
         if (temp[class001.length - 1] == class001[i].getHeight())
            System.out.println("키가 제일  큰 사람은 " + class001[i].getName());

      }
      System.out.println();

      // System.out.println("학생 들중 나이가 가장 적은 학생 "+);

   }

   public void a() {
      int n = 10;
      b(n);
      System.out.println(n);
   }

   public void b(int a) {
      a = 20;
   }

   public void a1() {
      Student01 ss = new Student01();

      ss.setName("홍길동");
      System.out.println(ss.getName());
   }

   public String b1(String aa)
   { aa="이순신";
      return aa;
   }

}