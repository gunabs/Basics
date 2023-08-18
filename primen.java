package com.basic.pkg;

public class primen {
	
	
	
	public static void main(String[] arg)
	{
		primen pp=new primen();
		pp.find_prime(2);
		
	}
	
	int prime_count=0;

	void find_prime(int no)
	{
		int div=2; 
		int count=0;  
		
		while(div<=no/2)
		{
			if(no%div==0)
			{
				System.out.println(no+"not prime");
				count=count+1;
				break;
			}
			div=div+1;
		}
		
		
	
				if(count==0)
		{
			System.out.println(no+"is prime");
			 prime_count=prime_count+1;
		
		}
		
	if(prime_count<=8)
	{
		    no=no+1;
			find_prime(no);
	}

		}	
	
	
	}
	
