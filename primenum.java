package com.basic.pkg;

public class primenum {
	void prime() {
		int num = 17;
		int count = 0;
		for (int i = 2; i <= num / 2; i = i + 1)

		{
			if (num % i == 0) {
				count = count + 1;
			}

		}

		if (count == 0) {
			System.out.print("prime");
		} else {
			System.out.print("not prime");

		}

	}

	public static void main(String[] args) {

		primenum prime = new primenum();
		prime.prime();
	}

}
