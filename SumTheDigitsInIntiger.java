import java.util.Scanner;
class SumTheDigitsInIntiger{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Eneter No. Between 0 to 1000 : ");
		int n = sc.nextInt(); //156
		int num = n;
		int sum = 0;
		int lastdigit = 0;

		lastdigit = n%10; // 6
		sum = sum + lastdigit; // 0+6=6
		n = n/10; //15

		lastdigit = n%10; //5
		sum = sum + lastdigit; //6+5=11
		n = n/10; //1

		lastdigit = n%10; //1
		sum = sum + lastdigit; //11+1=12
		n = n/10; //0

		System.out.println("User Entered No. is : " + num);
		System.out.println("Sum of Digits of number is : " + sum);

    }

}
