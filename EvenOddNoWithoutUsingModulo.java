import java.util.*;

class EvenOddNoWithoutUsingModulo {
	public static void main(String[] args) {

		System.out.println("Enter no. to check whether it is Even or Odd : ");
		int n = new Scanner(System.in).nextInt(); // scanner class is merged here

		System.out.println(n % 2 == 0);
		System.out.println(n / 2 == n / 2.0);
		System.out.println((n / 2) * 2 == n);

	}
}