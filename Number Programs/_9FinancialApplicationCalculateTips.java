import java.util.*;
class _9FinancialApplicationCalculateTips
{
	public static void main(String[] args) 
	{
		//tip amount = (tipRate*bill) /100;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Bill Amount : ");
		float bill = sc.nextFloat();

		System.out.print("Enter Gratuity (TipRate) : " );
		float tipRate = sc.nextFloat();

		float tipAmount = (bill*tipRate)/100;
		float totalAmount = bill + tipAmount;

		System.out.println("Tip Amount is : " +tipAmount);
		System.out.println("Total Bill is : " + totalAmount);
		
	}
}