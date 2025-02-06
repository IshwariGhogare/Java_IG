import java.util.Scanner;
class TenthMarksPassFailResult{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter Marks: ");
        float marks = sc.nextFloat();
        
        float percent = (marks*100) / 600;

        //String s = (percent>=35)?("pass"):("Fail");
        String s = ((percent>=75)?("A grade with "+ percent +" %"):((percent>=60)?("B Grade with "+ percent+" %"):((percent>=35)?("C Grade with "+ percent+" %"):("Failed"))));
        System.out.println(s);
	}
}
