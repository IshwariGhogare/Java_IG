class _3SwapTwoNumbersWithoutUsingThirdVariable
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;

		System.out.println("Before Swapping");
		System.out.println(a);
		System.out.println(b);
		System.out.println();

		a += b;
		b = a-b;
		a = a-b;

		System.out.println("After Swapping");
		System.out.println(a);
		System.out.println(b);

	}
}