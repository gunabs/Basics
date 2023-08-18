package com.basic.pkg;

public class check {
	class x{
		int a=1;
		static int b=2;
		void m() {
			System.out.println("i");
		}
		  static void n () {
			System.out.println("j");
		}
		
	}
	class Y extends x{
		
	}
	

	public static void main(String[] args) {
		x y=new x ();
		System.out.println(y.a);
		System.out.println(y.b);
		y.m();
		y.n();

	}

}
