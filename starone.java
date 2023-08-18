package com.basic.pkg;

public class starone {

	public static void main(String[] args) {
		
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<row;col++)
			{
				System.out.print("*"+" ");
			}
			for(int no=1;no<=6-row;no++)
			{
				System.out.print(1+" ");
			}
			System.out.println();
		}
	}

}
