import java.util.*;
class PrintOddNosFrom100to1{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
       
        System.out.println("Print odd nos. from 100 to 1 : ");

        for(int i = 100; i>=1; i--){
        	if(i%2 != 0){
        		System.out.println(i);
        	}
        }
	}
}