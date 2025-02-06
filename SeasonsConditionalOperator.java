import java.util.*;
class SeasonsConditionalOperator{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Month :");
		String s = sc.next().toUpperCase();
		// FEB MAR APR MAY SUMMER
		//OCT NOV DEC JAN WINTER 
		//JUN JUL AUG SEP MONSOON
		
        String op = 
        ((s.equals("FEB"))||(s.equals("MAR"))||(s.equals("APR"))||(s.equals("MAY")))?s + " is a Summer":
        ((s.equals("OCT"))||(s.equals("NOV"))||(s.equals("DEC"))||(s.equals("JAN"))?s + " is a Winter":
        ((s.equals("JUN"))||(s.equals("JUL"))||(s.equals("AUG"))||(s.equals("SEP")))?s + " is a Monsoon":
        "invalid");
        System.out.println(op);
	}
}