import java.util.Set;
import java.util.TreeSet;

//import InnerClassExamples.inner1;
//import InnerClassExamples.inner2;

abstract class example{
	static int bb=11;
	static void newmeth(){
		System.out.println("abcs");
	}
	public abstract void methoda();
	class insideAbstract{
		void methoda(){
			System.out.println("inside abstrat class of example");
		}
	}
}

interface sample {
	void method(int a);
	
	

	 class A{
		void methodnew (int b){
			System.out.println("abc");
		}
		
		
		
	}
}

class sample2{
	public void methodz(int a) throws NullPointerException {
		System.out.println("int a"+a);
	}
}

public class InnerClassExamples extends sample2 implements sample  {
	@Override
	public void methodz(int a)  {
		System.out.println("int a"+a);
	}
	
	
	static int y=10;
	
	
	int z=12;
	static int area(int x){
		x=11;
		return x;
	}
	void sample(){
		System.out.println("empty method");
	}
	@Override
	public void method(int a) {
		System.out.println("overridden inside outerclass");
		
	}
	
	
	static class inner1 implements sample{

		@Override
		public void method(int a) {
			System.out.println("overridden inside static innerclass "+ a);
			System.out.println(InnerClassExamples.y);
			System.out.println(InnerClassExamples.area(2));
			
			
		}
		int y=12;
		
		
		
		
	}

	class inner2 implements sample{

		@Override
		public void method(int a) {
			System.out.println("overridden inside normal innerclass");
			
		}
		inner2 (int a){
			System.out.println("inside constructor "+a);
		}
		public void createInner2Instance(){
			System.out.println("trying to create instance");
			
		}
		
	}
	public void createInstance(){
		InnerClassExamples.inner1 i1= new inner1();
		i1.method(12);
	}
	public static void main(String a[]){
		
		Set<String> ts= new TreeSet<String>();
		ts.add(null);
		ts.add("abcs");
		System.out.println(ts);
		InnerClassExamples outer= new InnerClassExamples();
		outer.createInstance();
		InnerClassExamples.inner2 ic=new InnerClassExamples().new inner2(2);
		//inner2 ic2= outer.new inner2();
		
	}
	/*@Override
	public void methoda() {
		example.insideAbstract eia = new insideAbstract();
		eia.methoda();
		
	}*/

	

}
