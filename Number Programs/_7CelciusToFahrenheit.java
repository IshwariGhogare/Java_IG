import java.util.*;
class _7CelciusToFahrenheit
{
	public static void main(String[] args) 
	{
		//Fahrenheit = (9/5) * calcius +32

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter temperature in degree celcius : ");
		double tempInDegree = sc.nextDouble();
		final double fahrenheit = (9/5.0) * tempInDegree + 32;

		System.out.println("Temperature in degree celcius is : " + tempInDegree);
		System.out.println("temperature in fahrenheit is : " + fahrenheit);
		
	}
}