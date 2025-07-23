class _10LogicalOperator
{
	public static void main(String[] args)
	{
		System.out.println(true && true); //t
		System.out.println(true || true); //t
		System.out.println(true && false); //f
		System.out.println((!true) && true); //f
		System.out.println(0%2 == 0 || 1%2 == 1); //t
		System.out.println(4>6 && false); //f
		System.out.println(!false || !true); //t
		System.out.println('a'=='A' || false==false); //t
		System.out.println('a'/'b' == 0 || '1' == 1); //f
		
	}
}