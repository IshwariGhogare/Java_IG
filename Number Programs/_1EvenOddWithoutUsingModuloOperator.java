class _1EvenOddWithoutUsingModuloOperator
{
	public static void main(String[] args)
	 {
	 	//Sol I
		int a = 7;
		int toCheck = (a/2)*2;
		System.out.println(a == toCheck);

		//Sol II
		System.out.println((a/2) == (a/2.0));

	}
}