package com.basic.pkg;

public class col {

	public static void main(String[] args) {
		for (int row=1;row<=5;row++)
		{
			for(int star=5;star>=row;star--)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}

	}

}
