package com.basic.pkg;

public class level1 {

	public static void main(String[] args) {
		
		
			for(int col=5;col>=1;col--)
			{
				for(int row=5;row>=col;row--) {
					System.out.print(row+" ");
				}
				System.out.println();
				
			}
			
			
			
		}
	}


//output
//5
//5 4
//5 4 3
//5 4 3 2 1