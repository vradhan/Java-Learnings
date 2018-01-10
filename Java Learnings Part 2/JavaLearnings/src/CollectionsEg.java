import java.util.*;
import java.util.Map.Entry;


class Employee implements Comparable {
	
	
	public String name;
	public int phoneNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	@Override
	public int compareTo(Object O) {
		Employee emp=(Employee)O;
		if(name.equals(emp.name) && phoneNo==emp.phoneNo){
			return 0;
		}
		return -1;
	}
	
	@Override
	public int hashCode(){
		int hash;
		hash=7*this.phoneNo;
		return hash;
	}
	
	public boolean equals(Object obj){
		Employee emp=(Employee) obj;
		boolean result=false;
		if(emp==null || emp.getClass()!=getClass()){
			return result;
		}
		else{
			if(this.phoneNo==emp.getPhoneNo() && this.name.equals(emp.getName())){
				result= true;
			}
		}
		return result;
	}
}

public class CollectionsEg {
	/*
public Map<String,Integer> removeduplicates(List<Employee> l2){
	l2= new ArrayList<Employee>();
	
	
	
		
	}*/
	
	

	public static void main(String a[]){
	
	LinkedList<Employee> ll= new LinkedList<Employee>();
	
	Employee em= new Employee();
	em.setName("vishnu");
	em.setPhoneNo(805695);
	
	ll.add(em);
	
	Employee em1= new Employee();
	em1.setName("radhan");
	em1.setPhoneNo(78754);
	
	ll.add(em1);
	
	Employee em2= new Employee();
	em2.setName("radhan");
	em2.setPhoneNo(98754);
	
	ll.add(em2);
	
	HashSet<Employee> hs = new HashSet<Employee>(ll.size());
	
	Iterator it=ll.iterator();
	while(it.hasNext()){
		hs.add((Employee)it.next());
	}
	System.out.println(hs);
	
	Map<Employee,Employee> empp = new HashMap<Employee,Employee>();
	for(Employee emp:ll){
		//System.out.println("name is "+emp.getName()+"ph no is "+emp.getPhoneNo());
		empp.put(emp, emp);
	}
	//empp.put(key, value)
	
	
	Map<String, Integer> mp=new HashMap<String, Integer>();
	for(Employee emp:ll){
		System.out.println("name is "+emp.getName()+"ph no is "+emp.getPhoneNo());
		
			mp.put(emp.getName(), emp.getPhoneNo());
		
		
	}
	
	
	for(Entry<String, Integer> entry: mp.entrySet()){
		System.out.println("key is :"+entry.getKey()+" value is "+entry.getValue());
	}
	
	
	
	//if(mp.containsKey())

}
	

	
}