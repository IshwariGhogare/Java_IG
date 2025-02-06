
import java.util.Scanner;
class ReverseNumber{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

        System.out.println("Enetr Number to find Reverse : ");
		int n = sc.nextInt(); //546
		int duplicate = n;
		int rev = 0;

		int rem = n%10; //6
		rev = rev*10 + rem;

		n = n/10; //54
		rem = n%10; //4
		rev = rev*10 + rem; //64

		n = n/10; //5
		rem = n%10; //5
		rev = rev*10 + rem; //645

		System.out.println("Original No is : " + duplicate);
		System.out.println("Reverse No is : " + rev);

	}
}