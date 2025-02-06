import java.util.*;
class EvensumUsingLoops{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number : ");
		int n = sc.nextInt();

		int dup = n;
		int evensum = 0;

		while(n>0){
			int rem = n%10;
			if(rem%2==0)
			   evensum += rem;

			n /= 10; 
		}
		System.out.println(evensum);
		System.out.println(dup);


	}
}