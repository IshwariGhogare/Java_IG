import java.util.Scanner;
class ProductOfDigits{
	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 4 digit No to calculate product : ");
        int n = sc.nextInt();//4567
        int dup = n;
        int lastdigit = 0;
        int product = 1;

        lastdigit = n%10; //7
        product = product * lastdigit; //1*7 = 7

        n = n/10; //456
        lastdigit = n%10; //6
        product = product * lastdigit;// 7*6 = 42

        n = n/10; //45
        lastdigit = n%10; //5
        product = product * lastdigit;// 7*6*5 = 210

        n = n/10; //4
        lastdigit = n%10; //4
        product = product * lastdigit;// 7*6*5*4= 840

        n = n/10; //0
        System.out.println("User Entered No is : " + dup);
        System.out.println("Product of Digits of Number is : " + product);
        
	}
}