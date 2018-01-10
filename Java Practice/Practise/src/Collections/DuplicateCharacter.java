package Collections;

import java.lang.reflect.*;
import java.util.*;

public class DuplicateCharacter {

    public void findDuplicateChars(String str){
        
        Map<Character, Integer> dupMap = new HashMap<Character, Integer>(); 
        char[] chrs = str.toCharArray();
        for(Character ch:chrs){
            if(dupMap.containsKey(ch)){
                dupMap.put(ch, dupMap.get(ch)+1);
            } else {
                dupMap.put(ch, 1);
            }
        }
        Set<Character> keys = dupMap.keySet();
        for(Character ch:keys){
            if(dupMap.get(ch) > 1){
                System.out.println(ch+"--->"+dupMap.get(ch));
            }
        }
    }
    
     
    public static void main(String a[]){
    	try{
        DuplicateCharacter dcs = new DuplicateCharacter();
        dcs.findDuplicateChars("Java2Novice");
        Method[] md= dcs.getClass().getMethods();
        for(Method m:md)
        {
        	System.out.println(m.getName());
        }
        Class myClass= Class.forName("DuplicateCharacter");
        System.out.println(myClass.getName());
    }

    catch(ArithmeticException e){
    	System.out.println("hi");
    	
    }
    	catch(Exception ae){
    		
    	}
}
}