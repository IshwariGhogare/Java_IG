import java.util.*;
class ToCheckCharacterIsLowercase_Uppercase_Digit_SpecialCharacter{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter Character : ");
		char ch = sc.next().charAt(0);

		//String s = ((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))?((ch>='A'&&ch<='Z')?(ch + " is a Upercase Alphabet"):(ch + " is a lowercase Alphabet")):((ch>='0' && ch<='9')?(ch + " is a Digit"):(ch + " is a Special character"));
		
        String s = ((ch>='A' && ch<='Z')?(ch + " is a Uppercase"):((ch>='a' && ch<='z')?(ch + " is a Lowercase"):((ch>='0' && ch<='9')?(ch + " is a Digit"):(ch + " is a special character"))));
		System.out.println(s);
	}
}