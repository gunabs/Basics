package File_Handling;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadLine {

	public static void main(String[] args) {
		int line=0; int count=0;
		try {
			
			FileReader tr=new FileReader("E:\\guna\\A.txt");
			int i=0;
			BufferedReader br=new  BufferedReader (tr);
			
			while(br.ready())
			{
				
				System.out.println(br.readLine());
				line++;
				
				System.out.print(line);
				
				
			}
			
			
		}
		catch (Exception e)
		{
			System.out.print("check code");
		}
		
			
		}
		
	
	

}
