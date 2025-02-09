import java.util.*;
class AreaNPerimeterOfCircle
{
    public static void main(String[]args)
    {
        float r = 5.5f;
        final float pi = 22/7f; //should we mention f here or we shouldnt
        float perimeter = 2*pi*r;
        float area = pi*r*r;

        System.out.println("Perimeter of circle with radius 5.5 cm is : "+ perimeter+ " cm^2");
        System.out.println("Area of circle with radius 5.5 cm is : "+ area + " cm^2" );

    }


	}