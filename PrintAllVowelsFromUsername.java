import java.util.*;
class PrintAllVowelsFromUsername{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter username : ");
        String s = sc.next().toLowerCase();

        int length = s.length();

        for(int i = 0; i<length; i++){
        	if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='0'||s.charAt(i)=='u'){
        	System.out.println(s.charAt(i));
        	}
        }

	}
}