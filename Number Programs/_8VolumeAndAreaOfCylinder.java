import java.util.*;
class _8VolumeAndAreaOfCylinder
{
	public static void main(String[] args) 
	{
		//area = 3.14 * r * r;
		//volume = area * height;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter radius of cylinder : " );
		float r = sc.nextFloat();
		
		System.out.print("Enter height of cylinder : ");
		float height = sc.nextFloat();

		float area = 3.14f * r * r;
		float volume = area * height;

		System.out.println("Area of cylinder is : " + area);
		System.out.println("Volume of cylinder is : " + volume);
		
	}
}