package week1;

import java.util.Iterator;

public class PrimeNumbers {

	public static void main(String[] args) {
		int input=12;
		boolean flag=false;
		for (int i = 2; i <=6; i++) {
			if (input%i==0) {
				flag=true;
				break;
			
				
			}
			
			
		}
		if (flag==false) {
			System.out.println("prime");
			
		}
		else {
			System.out.println("not a prime");
		}
		

	}

}
