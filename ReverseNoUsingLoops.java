import java.util.*;
class ReverseNoUsingLoops{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number : ");
		int n = sc.nextInt();

		int dup = n;
		int sum = 0;

		while(n>0){
			int rem = n%10;
			sum += rem;

			n /= 10; 
		}
		System.out.println(sum);
		System.out.println(dup);


	}
}