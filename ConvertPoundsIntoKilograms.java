import java.util.Scanner;
class ConvertPoundsIntoKilograms{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter the weight in pounds : ");
		float pounds = sc.nextFloat();

		float kilograms = pounds * 0.454f;
		System.out.println(kilograms);
	}
}