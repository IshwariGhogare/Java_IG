import java.util.Scanner;
class ConditionalOperator{ //find largest no among 3
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		int a = 10;
		int b = 4;
		int c = 1;

		int large = (a>b)  ?  ((a>c)? (a): (c))  :  ((b>c)?(b):(c));
		System.out.println(large);
	}
}