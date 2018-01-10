
public class StringExample {
	
	public static void main(String a[]){
		
		 String myAddress="My address is 58.104.71";
		myAddress.split(" 5");
		String spliWord=null;
		if(myAddress.contains(" 5"));
		spliWord=myAddress.substring(myAddress.indexOf(" 5"));
		System.out.println(spliWord);
		
		String[] IPmyAddress={"My address is 58.104.71","My 2nd address is 50.75.900"};
        String numberOnly= myAddress.replaceAll("[^0-9]", "");
        System.out.println(numberOnly);
		for (int i=0; i<IPmyAddress.length;i++)
		{
			if(IPmyAddress[i].matches("[^0-9]")){
				System.out.println("the ip address are:"+IPmyAddress[i]);
			}
			else{
				System.out.println("wrong pattern matching");
			}
		}
		
	}

}
