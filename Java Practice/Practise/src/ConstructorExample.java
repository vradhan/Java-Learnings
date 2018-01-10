class constructorOne{
	
	
	constructorOne(String n){
		System.out.println("the constructorone name is:"+n);
	}
	constructorOne(String n,int a){
		super();
		System.out.println("hi");
		
	}

	constructorOne(){
		System.out.println("hi: this is from constructorone");
	}
}

class constructorTwo extends constructorOne{
	constructorTwo(){
		System.out.println("hi: this is from constructortwo");
		
	}
	
constructorTwo(String n){
	super("radhan");
	
	
	System.out.println("the constructortwo name is:"+n);
		
	}
	
}
public class ConstructorExample  {
	public static void main(String a[]){
		
		constructorOne cc3= new constructorOne("ravi",10);
		System.out.println("line 2---------------------------");	
	constructorOne cc2=new constructorTwo();
	System.out.println("line 3---------------------------");	
	constructorOne cc21=new constructorTwo("renga");
	System.out.println("line 4---------------------------");
	constructorOne c1=new constructorOne();
	System.out.println("line 5---------------------------");
	constructorOne cc1=new constructorOne("sai");
	System.out.println("line 6---------------------------");
	constructorTwo c2=new constructorTwo("vishnu");
	System.out.println("line 7---------------------------");
		
	}

}
