import java.util.*;
class LargestNoAmong3{
	public static void main(String[]args){
		int a = 23;
		int b = 18;
		int c = 8;

		int temp = ((a>b)?((a>c)?(a):(b)):((b>c)?(b):(c)));

         System.out.println(" largest No. Among 3 is : " + temp);
	}
}