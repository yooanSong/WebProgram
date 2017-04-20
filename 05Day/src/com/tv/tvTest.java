package com.tv;

public class tvTest {

	public static void main(String[] args) {
		//3개의 tv객체를 생성하여 각각의 정보와 가장 비싼 
		//제품과 가장 저렴한 제품을 출력한다 
		
		Tv tvArray []= new Tv[3];
		tvArray [0]= new Tv("INFINIA", 1500000, "LED TV");
		tvArray [1]= new Tv("XCANVAS", 1000000, "LCD TV");
		tvArray [2]= new Tv("CINEMA", 2000000, "3D TV");
		
		int maxPriceIndex =0;
		int minPriceIndex =0;
		
		for(int i=0; i<tvArray.length; i++){
			System.out.println(tvArray[i].toString());
			
			if(tvArray[maxPriceIndex].getPrice()< tvArray[i].getPrice()){
				maxPriceIndex =i;
			}
			if(tvArray[minPriceIndex].getPrice()> tvArray[i].getPrice()){
				minPriceIndex =i;
			}
			
		}
			
		System.out.println();	
		System.out.println("가격이 가장 비싼 제품:"+tvArray[maxPriceIndex].getName());
		System.out.println("가격이 가장 저렴한 제품:"+tvArray[minPriceIndex].getName());

	}

}
