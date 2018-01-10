package com.core.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.ivy.util.StringUtils;

class arraySize{
	static String aww[] = {"abc","def","fga"};
	
}

public class DateUtils {
	
	private static String vehName = "S-MAX CD539 SAV~2016.5 MILLESIME~SAV~TITANIUM";

	public static void main(String[] args) throws NoSuchAlgorithmException {

/*
		//timeConversion("07:05:45PM");
		 Scanner scan = new Scanner(System.in);
	        String input = scan.nextLine();
	       // System.out.println(input);
	        System.out.println(createMDEncryptionPwd(input));
	        scan.close();
		*/
	//	System.out.println(getLocalCurrentDate());
		//findVehs("B515 ECOSPORT~2017.75 MILLESIME~1.0L ECOBOOST 125CV~M5 TRANSMISSION");
		
		System.out.println("result from veh =="+findExcludedVeh(vehName));
		
	}
	private static String createMDEncryptionPwd(String input) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("MD5");
		md.update(input.getBytes());
		
		byte byteData[] = md.digest();
		
		StringBuffer sb = new StringBuffer();
		
		for(int i=0 ; i > byteData.length; i++){
			sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
		}
		
		
		 StringBuffer hexString = new StringBuffer();
	    	for (int i=0;i<byteData.length;i++) {
	    		String hex=Integer.toHexString(0xff & byteData[i]);
	   	     	if(hex.length()==1) hexString.append('0');
	   	     	hexString.append(hex);
	    	}
	    	System.out.println("Digest(in hex format):: " + hexString.toString());
	        return hexString.toString();
	}
	/*static String timeConversion(String unFormattedTime) {
		int hourClock = 12;
		String formattedTime = unFormattedTime.substring(0,unFormattedTime.length()-2);
	       if(unFormattedTime.contains("PM")){
	    	   int time = Integer.valueOf(unFormattedTime.split("\\:")[0]);
	    	   time+=hourClock;
	           formattedTime = String.valueOf(time)+formattedTime.substring(2);
	           
	       }
	        return formattedTime;
	        
	    }*/
	
	private static void findVehs(String vehName){
		String excludeVeh = "B515 ECOSPORT";
		String split = "(";
		Pattern pattern = null ;
		StringBuffer sb = new StringBuffer(excludeVeh);
		//sb.append(excludeVeh);
		sb.insert(0, "(");
		
		for(String str : sb.toString().split("~")){
			
			split = split + str + ")*\\~.*(";
			
		}
	
		System.out.println("split21212-->"+split);

		System.out.println("vehname--"+vehName.substring(vehName.indexOf("~")+1,vehName.length()));
		vehName = vehName.substring(vehName.indexOf("~")+1,vehName.length());
		split = split.substring(split.indexOf("~")+3, split.length());
		split = split.substring(0, split.length()-5);
		System.out.println("split-->"+split);
		pattern = Pattern.compile(split) ;
		
		Matcher mm = pattern.matcher(vehName);
		if(mm.find()){
			System.out.println("yess");
			System.out.println("trial run"+mm.group());
		}
		
		/*Pattern pp = Pattern.compile(excludeVeh.split("~")[0]+"\\~.*"+excludeVeh.split("~")[1]);
		Matcher matcher = pp.matcher(vehName);
		while(matcher.find()){
			System.out.println("matched");
	          //System.out.print("Start index: " + matcher.start());
	            //System.out.print(" End index: " + matcher.end() + " ");
	            System.out.println(matcher.group());
		}*/
		
		
		
	}
	
	private static boolean findExcludedVeh(String vehname){
		//~1.0L ECOBOOST 125CV~LOCAL SVP
		String excludeVeh = "S-MAX CD539 SAV~SAV~TITANIUM";
		if(vehname.equalsIgnoreCase(excludeVeh)){
			System.out.println("found match");
			return true;
		}
		if(vehname.contains("~")){
		vehname = vehname.substring(vehname.indexOf("~")+1,vehname.length());
		//System.out.println("vehname-->"+vehname);
		String formattedExcludeVeh = excludeVeh.substring(excludeVeh.indexOf("~")+1, excludeVeh.length());
		//System.out.println("excludeVeh-->"+formattedExcludeVeh);
		String uscsplit[] =  formattedExcludeVeh.split("~");
		System.out.println("uscsplit.length-->"
				+ uscsplit.length);
		
		List<String> tokens = new ArrayList<String>();
		if(uscsplit.length >1){
				for(String str : uscsplit){
					System.out.println("str-->"+str);
					if(vehname.contains(str)){
						System.out.println("yes1111");
						tokens.add(str);
					}
				}
				System.out.println("tokens.size()-->"+tokens.size());
				if(tokens.size()>0){
					System.out.println("formatted exclude veh-->"+formattedExcludeVeh);
					System.out.println("vehname--"+vehname);
						System.out.println("tokens.get(tokens.size()-1)"+tokens.get(tokens.size()-1)+"~");
						String vehPattern2 = "~"+tokens.get(tokens.size()-1);
						String excludeVehSubStr = formattedExcludeVeh.substring(formattedExcludeVeh.indexOf("~")+1,formattedExcludeVeh.length());
						String vehSubStr = vehname.substring(vehname.indexOf("~")+1,vehname.length());
						System.out.println("vehSubStr-->"+vehSubStr);
						System.out.println("excludeVehSubStr-->"+excludeVehSubStr);
						System.out.println("vehSubStr-->"+vehSubStr);
						System.out.println("vehname-->"+vehname);
						System.out.println("excludeVeh-->"+excludeVeh);
						System.out.println("vehname.contains(vehPattern2)--"+vehname.contains(vehPattern2));
						System.out.println("excludeVehSubStr.equalsIgnoreCase(vehSubStr)--"+excludeVehSubStr.
								equalsIgnoreCase(vehSubStr));
						System.out.println("vehname.equalsIgnoreCase(excludeVeh)--"+vehname.equalsIgnoreCase(excludeVeh));
						
					if(vehname.contains(vehPattern2) && (excludeVehSubStr.
								equalsIgnoreCase(vehSubStr) || (vehSubStr.split("~").length > 1))){
							return true;
						}
				/*		if (vehSubStr.split("~").length > 1){
							return true;
						}*/
					}
			
		}
		else {
			System.out.println("vehname here -->"+vehName);
			System.out.println(uscsplit[0]);
			if(vehName.contains("~"+uscsplit[0]) ){
				System.out.println("yesaweaweaw");
				return true;
			}
		}
		}
		/*String abc[] = excludeVeh.split("~"); 
		if(vehname.endsWith(abc[abc.length-1])){
			return true;
		}*/
		return false;
	}
	
	private static Date getLocalCurrentDate() {
	
		return new Date();
		
	}

}
