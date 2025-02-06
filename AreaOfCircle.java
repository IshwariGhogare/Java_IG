import java.util.*;

public class AreaOfCircle {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a radius of circle (cm):");
		float r = sc.nextInt();
		final float pi = 22 / 7;
		float area = pi * r * r;

		System.out.println("Area of Circle is : " + area + "cm^2");
	}
}