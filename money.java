package com.basic.pkg;
public class money {
	public static void main(String[] args) {
		int money = 12654;
		int rs2000 = 0, rs500 = 0, rs200 = 0, rs100 = 0, rs50 = 0, rs10 = 0, rs1 = 0;
		 {
			rs2000 = money / 2000;
			money = money % 2000;
			System.out.println("rs2000:" + rs2000);
			rs500 = money / 500;
			money = money % 500;
			System.out.println("rs500:" + rs500);
			rs200 = money / 200;
			money = money % 200;
			System.out.println("rs200:" + rs200);
			rs100 = money / 100;
			money = money % 100;
			System.out.println("rs100:" + rs100);
			rs50 = money / 50;
			money = money % 50;
			System.out.println("rs50:" + rs50);
			rs10 = money / 10;
			money = money % 10;
			System.out.println("rs10:" + rs10);
		}
	}
}
