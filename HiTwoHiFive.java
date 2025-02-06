import java.util.Scanner;
class HiTwoHiFive{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int n = sc.nextInt();

       System.out.println((n%2==0 && n%5==0)?("HiTwo HiFive"):((n%2==0)?("hi two"):((n%5==0)?("hi five"):(""))));
       
        System.out.println(s);
		
	}
}
