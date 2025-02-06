import java.util.*;
class ToCheckCharacterIsLowercase{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);

		String s= ((ch>='a' && ch<='z')?(ch +" is Lowercase Alphabet"):(ch + " is not lowercase Alphabet"));
		System.out.println(s);
	}
}