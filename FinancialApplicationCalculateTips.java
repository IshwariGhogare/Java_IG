
import java.util.Scanner;
class FinancialApplicationCalculateTips{
	public static void main(String[]args){
		
	Scanner sc = new Scanner(System.in);

    System.out.println("Enter Bill : ");
    float bill = sc.nextFloat();

    System.out.println("Enter Gratuity(TipRate) : ");
    float tipRate = sc.nextFloat();

    float tipAmount = (tipRate * bill)/100;
    float totalAmount = bill + tipAmount;

    System.out.println("Total bill is : " + totalAmount);
    System.out.println("Total tipAmount is : " + tipAmount);

    }

}
