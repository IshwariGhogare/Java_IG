import java.util.*;
class PrintCharactersFromUsername{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Name : ");
		String s = sc.next().toUpperCase();

		int length = s.length();
		for(int i = 0; i<length; i++){
			System.out.println(s.charAt(i));
		
		}

	}
}