package com.basic.pkg;

public class Alcazar {

	int ex_show_room_price;
	int tcs;
	int insurance;
	int regfee;
	static int  fastag=500;
	static int basicAccessorpackage=14999;
	int onRoadPrice;
	public Alcazar(int ex_show_room_price, int tcs, int insurance, int regfee,int onRoadPrice) {
		super();
		this.ex_show_room_price = ex_show_room_price;
		this.tcs =tcs;
		this.insurance = insurance;
		this.regfee = regfee;
	this.onRoadPrice=onRoadPrice;
	}
	int calculateOnroadprice()
	{
		 onRoadPrice=ex_show_room_price+ tcs+insurance+regfee+fastag+basicAccessorpackage;
		System.out.println("on road price is"+onRoadPrice);
	return onRoadPrice ;
		  
	}

	public static void main(String[] args) {
		
Alcazar prestiger_5_7str=new Alcazar(1677500,16775,69501,256905,0);
prestiger_5_7str.calculateOnroadprice();

	}

}
