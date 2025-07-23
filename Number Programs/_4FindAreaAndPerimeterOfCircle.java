class _4FindAreaAndPerimeterOfCircle
{
	public static void main(String[] args) 
	{
		//perimeter = 2 * 3.14 * r;
		//area = 3.14 * r* r;

		float r = 5.5f;
		final float pi = 3.14f;

		float perimeter = 2*pi*r;
		float area = pi * r*r;

		System.out.println("Perimeter Of Circle is : " + perimeter);
		System.out.println("Area of Circle is : " + area);
	}

}