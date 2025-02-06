import java.util.*;
class CharacterRange{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character : ");
		char ch = sc.next().charAt(0);

		String s = (ch>='A' && ch<='Z')?("It is Upper case Character"):("It is not Upper case Character");
		System.out.println(s);
		

	}
}