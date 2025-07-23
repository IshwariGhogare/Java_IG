import java.util.*;
class _14MultipleUserInput
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter No1 : ");
		byte b = sc.nextByte();

		System.out.println("Enter No2 : ");
		short s = sc.nextShort();

		System.out.println("Enetr No3 : ");
		int i = sc.nextInt();

		System.out.println("Enter Nuo4 : ");
		long l = sc.nextLong();

		System.out.println("Enter No5: ");
		float f = sc.nextFloat();

		System.out.println("Enter No6 : ");
		double d = sc.nextDouble();

		double sum = b+s+i+l+f+d;
		System.out.println("Sum of all the numbers is : " + sum);

		sc.nextLine();

		//String Input

		System.out.println("Enter your Name : ");
		String str = sc.nextLine();
		System.out.println(str);
		System.out.println();
	
		System.out.println("Enter your First Name : ");
		String st = sc.next();
		System.out.println(st);
		sc.nextLine();
		System.out.println();

		System.out.println("Enter a message :");
		String ss = sc.nextLine();
		System.out.println(ss);
		System.out.println();

		System.out.println("Enter a String : ");
		char a = sc.next().charAt(0);
		System.out.println(a);
		System.out.println();

	}
}