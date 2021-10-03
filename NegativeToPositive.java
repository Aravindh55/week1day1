package week1;

public class NegativeToPositive {

	public static void main(String[] args) {
		int number = -40;
		int positiveNumber = number-(number * 2);
		if (number < 0) {
			System.out.println("the number "+ number + " is converted into " + positiveNumber);

		}
		else {
			System.out.println("the number is not a negative number");
		}
	}

}
