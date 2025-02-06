import java.util.Scanner;
class SumOfevenOddNo{
	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 4 digit no. to calculate even odd sum : ");
		int n = sc.nextInt();
		int dup = n;
		int lastdigit = 0;
		int evensum = 0;
		int oddsum = 0;

		lastdigit = n%10; //4
		int temp = (lastdigit%2 == 0)? (evensum = evensum + lastdigit):(oddsum = oddsum + lastdigit); //evensum = 4

		n = n/10; //726
		lastdigit = n%10; //6
		 temp = (lastdigit%2 == 0)? (evensum = evensum + lastdigit):(oddsum = oddsum + lastdigit); //evensum = 4+6 = 10

		n = n/10; //72
		lastdigit = n%10; //2
		temp = (lastdigit%2 == 0)? (evensum = evensum + lastdigit):(oddsum = oddsum + lastdigit); //evensum = 4+6+2 = 12

		n = n/10; //7
		lastdigit = n%10; //7
		temp = (lastdigit%2 == 0)? (evensum = evensum + lastdigit):(oddsum = oddsum + lastdigit); //oddsum = 7;

		n = n/10; //0
		System.out.println("Number Entered by user is : " + dup);
		System.out.println("Evensum is : " + evensum);
		System.out.println("Odd sum is : " + oddsum);

	}
}