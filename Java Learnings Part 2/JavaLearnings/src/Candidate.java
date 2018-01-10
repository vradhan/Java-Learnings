import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MyCallable implements Callable<Candidate>{

	@Override
	public Candidate call() throws Exception {
		Thread.sleep(1000);
		Lock lock = new ReentrantLock();
		lock.lock();
		Candidate cand = new Candidate("132","vishnu");
		return cand;
	}
	
}

public class Candidate {
	
	private List<String> proposalVersion;
	
	private  String id;
	private  String name;
	
	public Candidate (String id, String name){
		this.id = id;
		this.name = name;
	}
	
	
	public List<String> getProposalVersion() {
		return proposalVersion;
	}

	public void setProposalVersion(List<String> proposalVersion) {
		this.proposalVersion = proposalVersion;
	}

	public static String checkForValue(String line){
		
		String lines[]=line.split("\n");
		int count=0;
		for(String str:lines){
		String regex="rx.*(zip|rar|tgz)";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
		if(m.find()){
			count=count+1;
		}
		}
		return String.valueOf(count);
	}
	
	public static String findIndexOfProgram(int A, int B){
		String one=String.valueOf(A);
		String two=String.valueOf(B);
		if(one.contains(two)){
			System.out.println("yes present");
			System.out.println(one.indexOf(two));
		}
		
		return "vishnu";
	}
	
	public void populateList(){
		this.proposalVersion= new ArrayList<String>();
		this.proposalVersion.add("1");
		this.proposalVersion.add("8");
		this.proposalVersion.add("5");
		this.proposalVersion.add("ALL");
		this.proposalVersion=formatList(this.proposalVersion);
		System.out.println(this.proposalVersion);
		this.proposalVersion.remove(this.proposalVersion.indexOf("ALL"));
		this.proposalVersion.add(0,"ALL");
		System.out.println(this.proposalVersion);
	}
	
	private List<String> formatList(List<String> inputList) {
		
		inputList.removeAll(Collections.singleton(null));
		Set<String> formattedSet = new LinkedHashSet<String>(inputList);
		inputList.clear();
		inputList.addAll(formattedSet);
		System.out.println(inputList.equals(this.proposalVersion));
		Collections.sort(inputList);
		return inputList;
	}

	public static void main(String args[]) throws InterruptedException, ExecutionException{
	/*	String line ="rw - delete_this.rar\nrx - vishnu.zip\nrx - abc.tgz\nrw - def.zip\n";
		//System.out.println(line);
		//System.out.println(checkForValue(line));
		int a= 1853786;
		int b= 53;
		//findIndexOfProgram(a, b);
		String abc;
		abc=(line!=null)?line:"abc";
		System.out.println("abc is:--"+abc);
		
		Test t= new Test();
		t.populateList();*/
		
		Candidate cad = new Candidate("101","hari");
		
		Candidate cad2 = new Candidate("101","hari");
		
		HashMap<Candidate,String> mp = new HashMap<Candidate,String>();
		mp.put(cad, "sachin");
		mp.put(cad2, "shewag");
		System.out.println(cad.toString());
		System.out.println(cad2.toString());
		//mp.put(cad2, "rahul");
		//hashMapWorkings(mp,cad);
		System.out.println(mp.size());
		//System.out.println(mp.get(cad));
		for(Candidate cand : mp.keySet()){
			System.out.println(mp.get(cand).toString());
		}
		
		Set<Entry<Candidate, String>> set = mp.entrySet();
		List<Entry<Candidate, String>> list = new ArrayList<Entry<Candidate, String>>(set);
		
		Collections.sort(list, new Comparator<Entry<Candidate, String>>(){

			@Override
			public int compare(Entry<Candidate, String> o1, Entry<Candidate, String> o2) {
				Map.Entry<Candidate, String> mp2 = (Entry<Candidate, String>)o1;
				Map.Entry<Candidate, String> mp3 = (Entry<Candidate, String>)o2;
				return mp2.getKey().id.compareToIgnoreCase(mp3.getKey().id);
			}
			
		});
		
		//threads using executor
		
		ExecutorService executor = Executors.newFixedThreadPool(10);
		Callable<Candidate> callable = new MyCallable();
		
		List<Future<Candidate>> futureList = new ArrayList<Future<Candidate>>();
		
		for(int i = 0; i<20; i ++){
			Future<Candidate> future = executor.submit(callable);
			futureList.add(future);
		}
		
		System.out.println("futureList.size()--"+futureList.size());
		
		for(Future<Candidate> fut : futureList){
			System.out.println(new Date()+"---"+fut.get().id);
		}
		
		//comparator using java 8
		
		Comparator<Entry<Candidate,String>> byValue = (entry1, entry2) -> entry1.getValue().compareTo(entry2.getValue());
		
		Collections.sort(list, byValue);
		
		//double comparision
		Comparator<Entry<Candidate, String>> byKey = (entry1, entry2) -> entry1.getKey().id.compareToIgnoreCase(entry2.getKey().id);
		byKey = byKey.thenComparing((entry1,entry2) -> entry1.getKey().name.compareToIgnoreCase(entry1.getKey().name));
		
		//by using stream in java 8
		mp.entrySet()
		.stream()
		.sorted(Map.Entry.<Candidate, String>comparingByValue())
		.forEach(System.out::println);
		
	}


	public static void hashMapWorkings(HashMap<Candidate,String> map, Candidate emp){
		System.out.println(map.get(emp));
		
		for(Candidate cand : map.keySet()){
			System.out.println(map.get(cand).toString());
		}
	}

	@Override 
	public boolean equals(Object obj){
		Candidate cad =(Candidate)obj;
		if(!(obj instanceof Candidate)){
			return false;
		}
		if(cad.id.equals(this.id) && cad.name.equals(this.name)){
			return true;
		}
		return false;
	}
	
	@Override 
	public int hashCode(){
		return Objects.hash(id, name);
	}
}
