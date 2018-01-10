import java.util.*;
import java.util.Map.Entry;

public class Employee{
	
	
	public static void main(String a[]){
		
		TreeMap<Integer,Object> tm= new TreeMap<Integer,Object>();
		tm.put(1,new EmployeeGenerator("vishnu",226055));
		tm.put(2, new EmployeeGenerator("sai",226056));
		tm.put(3, new EmployeeGenerator("uma",845154));
		tm.put(4, new EmployeeGenerator("ravi",835156));
		Set<Integer> keys = tm.keySet();
        for(Integer key:keys){
        	
            System.out.println(key+" ==> "+tm.get(key));
        }
        List<EmployeeGenerator> al = new ArrayList<EmployeeGenerator>();
        al.add(new EmployeeGenerator("vishnu",226055));
        al.add( new EmployeeGenerator("sai",226056));
        al.add(new EmployeeGenerator("uma",845154));
        
        Comparator <EmployeeGenerator> c1= new Comparator<EmployeeGenerator>() {
        	public int compare(EmployeeGenerator e1, EmployeeGenerator e2){
        	return e1.getId()-e1.getId();
        		
        	}
		};
		Collections.sort(al,c1);
		//int index=Collections.indexedBinarySearch(al , new EmployeeGenerator("vishnu", 226056));
		//System.out.println(index);
        
        //ArrayList al=new ArrayList(tm.entrySet());
        ListIterator lt=al.listIterator();
        /*while (lt.hasNext())
        {
        	String s=(String)lt.next();
        	System.out.println(s);
        }*/
      
        System.out.println("true or false:"+al.contains("vishnu"));
		System.out.println("true or false:"+tm.containsValue(new EmployeeGenerator("vishnu", 226056)));
	}
}

 class EmployeeGenerator implements Comparator<EmployeeGenerator> {
	
	private String empname;
	private int empid;
	
	protected EmployeeGenerator(String name,int empid){
	name=this.empname;
	empid=this.empid;
	}

	protected String getName(){
		return empname;
	}

	protected int getId(){
		return empid;
	}
	
	protected void setName(String name){
		name=this.empname;
	}
	
	protected void setId(int id){
		id=this.empid;
	}
	
	

	
	public int compare(EmployeeGenerator emp1, EmployeeGenerator emp2) {

		if( emp2.empid>emp1.empid)
		{
			return 1;
		}
		else
		return -1;
	}
 
 }
 


