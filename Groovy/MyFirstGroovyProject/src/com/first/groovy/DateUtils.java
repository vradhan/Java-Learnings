package com.first.groovy;

public class DateUtils {


	public static void main(String[] args) {

			timeConversion("07:05:45PM");
		
	}
	
	static String timeConversion(String unFormattedTime) {
		int hourClock = 12;
		String formattedTime = unFormattedTime.substring(0,unFormattedTime.length()-2);
	       if(unFormattedTime.contains("PM")){
	    	   int time = Integer.valueOf(unFormattedTime.split("\\:")[0]);
	    	   time+=hourClock;
	           formattedTime = String.valueOf(time)+formattedTime.substring(2);
	           
	       }
	        return formattedTime;
	        
	    }
}
