class ThreadOne {
	public static String getFontType(String template){
		return "Arial";
	}
}

class ThreadTwo {
	public static String templateCode;
	public static String sampleFont = "Vishnu is in this font "+ThreadOne.getFontType(templateCode)+" here goes";
}

public class MyThreadExample {
	
	public static void excecuteMethod(){
		ThreadTwo.templateCode="BEL";
		System.out.println("ThreadTwo.sampleFont-->"+ThreadTwo.sampleFont);
	}

    public static void main(String[] args) {
        Runnable r = new Runnable1();
        Thread t = new Thread(r);
        Runnable r2 = new Runnable2();
        Thread t2 = new Thread(r2);
        t.start();
        t2.start();
        excecuteMethod();
    }
}

class Runnable2 implements Runnable{
    public void run(){
        for(int i=0;i<11;i+=2) {
            System.out.println(i);
        }
    }
}

class Runnable1 implements Runnable{
    public void run(){
        for(int i=1;i<=11;i+=2) {
           System.out.println(i);
        }
        
    }
}