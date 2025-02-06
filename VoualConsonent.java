import java.util.*;
class VoualConsonent{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character : ");
		char ch = sc.next().charAt(0);

		System.out.println((ch=='a'||ch=='e'||ch=='e'||ch=='i'||ch=='o'||ch=='u')?(ch + " is voual"):(ch + " is a consonent"));
	}
}