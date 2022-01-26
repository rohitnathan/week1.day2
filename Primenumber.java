package week1.day2;

public class Primenumber {

	public static void main(String[] args) {
		int n = 13;
		boolean flag = false;

		for (int i = 2; i < n / 2; i++) {

			// Condition for non-prime number
			if (n % i == 0) {
				flag = true;
				break;
			}
			
			}
		
		if (!flag)
			System.out.println(n + "is a prime");
		else
			System.out.println(n + "ïs not a prime");

	}
}




