import java.util.*;
class SmallestNoAmong3_ConditionalOperator{
	public static void main(String[]args){

		int a = 10;
		int b = 14;
		int c = 34;

		int smaller = (a<b)  ?  ((a<c)?(a):(c))  :  ((b<c)?(b):(c));

		System.out.println("Smaller No is : " + smaller); 
	}
}