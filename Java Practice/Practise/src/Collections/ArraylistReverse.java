package Collections;

import java.util.ArrayList;

public class ArraylistReverse {
	
	
	protected ArrayList reverse(ArrayList list){
		
		ArrayList reversed= new ArrayList();
		
		for(int i=list.size()-1;i>=0;i--){
			Object obj=list.get(i);
			reversed.add(obj);
			
		}
		return reversed;
	}

}
