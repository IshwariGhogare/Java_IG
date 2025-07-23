class _9RelationalOperator
{
	public static void main(String[] args) 
	{
		System.out.println(10>20); //f
		System.out.println(10<20); //t
		System.out.println(0.0 <= 0); //t
		System.out.println(59.99 == 60); //f
		System.out.println(97 != 100);//t
		System.out.println('a' < 'A');  //f
		System.out.println('z' <= 122); //t
		System.out.println(false == true); //f
		System.out.println(true != true); //f
		System.out.println(22.0/7.0 >= 22.0f/7.0f); //t
		//System.out.println(false < true); //CTE- bad operand types for binary operator '<'

	}
}