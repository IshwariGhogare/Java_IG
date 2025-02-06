import java.util.*;
class ToCheckCharacterIsUppercase{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character : ");
		char ch = sc.next().charAt(0);

		String s = (ch>='A' && ch<='Z')?(ch + " is Uppercase Character"):(ch + " is not Uppercase Character");
		System.out.println(s);
		

	}
}