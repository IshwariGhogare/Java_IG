import java.util.Scanner;

class _4TakingUserInput
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter No 1 : ");
		int num1 = sc.nextInt();

		System.out.println("Enter No 2 : ");
		int num2 = sc.nextInt();

		int sum = num1 + num2;
		System.out.println("Sum of num1 and num2 is : " + sum);
		
	}
}