package File_Handling;

import java.io.FileReader;

public class Readcontent {

	public static void main(String[] args) {
		String s = "";
	int 	count=0;
		try {
			FileReader tr = new FileReader("E:\\guna\\A.txt" + ".");
			int i = 0;
			while ((i = tr.read()) != -1) {

				s = s + (char) i;
				
				if(i==32)
				{
					count++; //space count
					
				}
				
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	
		System.out.println(s);
		System.out.println(count);

	}
}
