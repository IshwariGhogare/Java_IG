import java.util.*;
class PrintAsciiTablefrom0to127{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Printing asciie table : ");

		for(int i = 1; i<=127; i++){
			System.out.println(i +" : "+ ((char)i));

		}
	}
}