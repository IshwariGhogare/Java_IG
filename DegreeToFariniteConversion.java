import java.util.*;

class DegreeToFariniteConversion{

	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter temperature in degree celcius : " );
        float celsius = sc.nextFloat();
        double fahrenheit = ((9.0/5)* celsius + 32);//should we use final or not
        
        System.out.println("Temperature in degree celcius is : " + celsius);
        System.out.println("Temperature in degree Fahrenheit is : " + fahrenheit);
        
        
	}
}