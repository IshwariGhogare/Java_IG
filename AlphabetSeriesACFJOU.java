import java.util.*;
class AlphabetSeriesACFJOU{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Print Series : "); //A C F J O U
		int a = 1;

		for(char ch = 'A'; ch <= 'Z'; ch+=a){
			System.out.println(ch);
			a++;
		}
	}
}