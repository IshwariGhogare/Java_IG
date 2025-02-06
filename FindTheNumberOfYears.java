import java.util.Scanner;
class FindTheNumberOfYears{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter minutes : ");
		int min = sc.nextInt();

	    int minIn1day = 24*60;
		int minIn1year = minIn1day * 365;

		int noOfyears = min/minIn1year;
		int noOfminremaining = min-(noOfyears*minIn1year);
		int noOfdays = noOfminremaining/minIn1day;

		System.out.println(noOfyears); 
		System.out.println(noOfdays); 

	}
}