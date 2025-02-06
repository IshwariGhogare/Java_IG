import java.util.*;
class MultiplicationTable{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number to Print table : ");
		int n = sc.nextInt();
		System.out.println("enter range to Print table : ");
		int range = sc.nextInt();

		for(int i = 1; i<= range; i++){
			System.out.println(n +" x "+ i +" = "+ (n*i));

		}
	}
}