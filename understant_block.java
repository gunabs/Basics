package com.basic.pkg;

public class understant_block {
	int x;
	static int y;
	
	
	{
		x=5;
	}
	
	static
	{
		y=67;
	}
	understant_block(int a)
	{
		x=a;
	}

	public static void main(String[] args) {
		
		understant_block a1=new understant_block(11);
		understant_block a2=new understant_block(12);
		System.out.println(understant_block.y);
		System.out.println(a1.x);
		System.out.println(a2.x);
		
	}

}
