import java.util.*;
class Sample{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Months: ");
		int months = sc.nextInt();		

		int years = months/12;
		int monRem = months%12;

		System.out.println(years + "  " + months);
		
	}
}