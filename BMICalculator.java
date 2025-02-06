import java.util.*;
class BMICalculator{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Weight in pounds : ");
		float weight = sc.nextFloat();
		System.out.println("Enter height in inches : ");
		float height = sc.nextFloat();

		float weightInkg = weight * 0.45359237f;
		float heightInmeters = height * 0.0254f;

		float bmi = weightInkg/ (heightInmeters*heightInmeters);

		System.out.println(bmi);

	}
}