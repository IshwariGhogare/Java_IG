import java.util.*;
class PrintEvenNosFrom1To100{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Print Even No.s from 1 to 100 : ");

		for(int i = 1; i<=100; i++){
			if(i%2==0){
				System.out.println(i);
			}
		}
		}
	}