import java.util.*;
class ArithmeticCalculator{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number 1 :");
		float f1 = sc.nextFloat();

		System.out.println("Enter Number 2 :");
		float f2 = sc.nextFloat();

		System.out.println("Enter Operator :"); 
		char op = sc.next().charAt(0);

		float opt = 0;

		opt = 
		(op == '+')?(f1+f2):
		((op=='-')?(f1-f2):
		((op=='*')?(f1*f2):
		((op=='/')?(f1/f2):
		((op=='%')?(f1%f2):(0.000001F)))));

		String output = f1+" "+op +" "+f2 +" = "+ opt;

		if(!(opt == 0.000001F))
			System.out.println(output);


		




	}
}