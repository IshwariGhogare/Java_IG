import java.util.*;

class AreaNVolumeOfCylinder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius of Cylinder in (cm) : ");
        float r = sc.nextFloat();

        System.out.println("Enter height of Cylinder in (cm) : ");
        float h = sc.nextFloat();

        double area = 3.14 * r * r;
        double volume = area * h;


        System.out.println("Area of cylinder is : " + area);
        System.out.println("Volume of Cylinder is : " + volume);
    }
}