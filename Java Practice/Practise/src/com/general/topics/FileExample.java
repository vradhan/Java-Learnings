package com.general.topics;
import java.io.*;


public class FileExample  
{
	public static void main(String a[]) throws FileNotFoundException{

	File fileDir= new File("E:/Study Materials/New folder");
	File [] files=fileDir.listFiles();
	int ch;
	  StringBuffer strContent = new StringBuffer("");
	  BufferedReader stream = null;  
	
	for(File f:files)
	{
		if(f.isFile())
		{
			 System.out.println(f.getName());
		}
		stream=new BufferedReader(new FileReader(f));
		String line;
		
		
	}



}
}