class _12IncrementAndDecrementOperator
{
	public static void main(String[] args) 
	{
		int poc = 100;
		System.out.println(++poc); //101
		System.out.println(++poc); //102
		System.out.println(poc++); //102--103 = 102
		System.out.println(++poc); //104
		System.out.println(++poc + poc++);  //105 + 105--106 = 210
		System.out.println(poc); //106
		
	}
}