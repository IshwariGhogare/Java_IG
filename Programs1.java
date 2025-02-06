import java.util.*;
class Programs1{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Print nos from 1 to 10 : ");

        int n = 1;
        while(n>=1 && n<=10){
        	System.out.println(n);
        	n++;	
        }
        System.out.println("************");


        System.out.println("Print Alphabets from A to Z : ");
        for(char ch = 'A'; ch <= 'Z';ch++)
         {
            System.out.println(ch);
         }
         System.out.println("**********");


         System.out.println("Print Alphabets from z to a: ");
         for(char ch = 'z'; ch <= 'a';ch--)
         {
            System.out.println(ch);
         }
         System.out.println("**********");


         System.out.println("Print digits from 0 to 9: ");
         for(char ch = '0'; ch <= '9';ch++)
         {
            System.out.println(ch);
         }
         System.out.println("**********");


         // System.out.println("Print Ascii  Value  : ");
         // for(int i = 1; i <= 127; i++);
         // {
         //    System.out.println(i + " :");
         // }


         // System.out.println("Print Table : ");
         // System.out.println("Enter Number: ");
         // int num = sc.nextInt();

         // System.out.println("Enter Range : ");
         // int range = sc.nextInt();


         // for(int i = 1; i <= range; i++)
         // {
         //    System.out.println(num + "X" + i +" = " + (num * i));
         // }


         System.out.println(" Print alphabet Series: "); //A C F J O U
         
         int a = 1;

         for(char ch = 65; ch <= 90 ; ch += a){
            System.out.println(ch);
             a++;
         }


	}
}