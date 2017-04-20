package com.common.util;

import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class CommonUtil {

	//1000000000=> 2   100, 000, 000 
	public static String getCurrency(int data){
		NumberFormat format = NumberFormat.getCurrencyInstance(Locale.KOREA);
		return format.format(data);
	}
	
	public static String getUserInput() { //스캐너해주는 거 
		Scanner s = new Scanner(System.in);
		return s.nextLine();
	}
	
	
	
	public static String getDate(Date d){ //숫자 넣으주면 문자열
		String formatData = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		formatData = sdf.format(d.getTime());
		return  formatData;
	}
	public static Date getDate(String cal){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d = null;
	   try{	
		d = sdf.parse(cal);
	   }catch(ParseException e){
		   e.printStackTrace();
	   }
		return d;
	}
	
	
}
