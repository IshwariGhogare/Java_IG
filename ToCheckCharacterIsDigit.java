import java.util.*;
class ToCheckcharacterIsDigit{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter character : ");
		char ch = sc.next().charAt(0);

		String s = ((ch>='a' && ch<='z')?(ch + " is digit"):(ch + " is not a Digit"));
		System.out.println(s);
	}

}