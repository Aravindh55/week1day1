package week1;

import java.util.Iterator;

public class Factorial {

	public static void main(String[] args) {
		int input = 5;
		int fact = 1;
		for (int i = 1; i <= input; i++) {
			fact = fact * i;

		}
		System.out.println(fact);
	}

}
