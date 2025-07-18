class _5ArithmeticOperatorBasicProgram
{
	public static void main(String[] args) {
		byte a = 5;
		byte b = 10;

		short c = 15;
		short d = 20;

		char e = 'A';
		char f = 'B';

		int g = 25;
		int h = 30;

		long i = 35;
		long j = 40;

		float k = 1.1f;
		float l = 2.2f;

		double m = 1.2;
		double n = 1.3;

		String o = "Om Sai ";
		String p = "Ram";


        System.out.println("Addition");
		System.out.println("Byte : " + (a+b));
		System.out.println("Short : " + (c+d));
		System.out.println("Char : " + (e+f));
		System.out.println("Int : " + (g+h));
		System.out.println("long : " + (i+j));
		System.out.println("Float : " + (k+l));
		System.out.println("Double : " + (m+n));
		System.out.println("String: " + (o+p));	
		System.out.println();


		System.out.println("Substraction");
		System.out.println("Byte : " + (a-b));
		System.out.println("Short : " + (c-d));
		System.out.println("Char : " + (e-f));
		System.out.println("Int : " + (g-h));
		System.out.println("long : " + (i-j));
		System.out.println("Float : " + (k-l));
		System.out.println("Double : " + (m-n));
		//System.out.println("String: " + (o-p));		//CTE String cannot be substracted from string
		System.out.println();


		System.out.println("Multiplication");
		System.out.println("Byte : " + (a*b));
		System.out.println("Short : " + (c*d));
		System.out.println("Char : " + (e*f));
		System.out.println("Int : " + (g*h));
		System.out.println("long : " + (i*j));
		System.out.println("Float : " + (k*l));
		System.out.println("Double : " + (m*n));
		//System.out.println("String: " + (o*p));	//CTE-bad operand type for binary operator * (String cannot be multiplied with String)
		System.out.println();


		System.out.println("Division");
		System.out.println("Byte : " + (a/b));
		System.out.println("Short : " + (c/d));
		System.out.println("Char : " + (e/f));
		System.out.println("Int : " + (g/h));
		System.out.println("long : " + (i/j));
		System.out.println("Float : " + (k/l));
		System.out.println("Double : " + (m/n));
		//System.out.println("String: " + (o/p));	  //CTE-bad operand type for binary operator / (String cannot be divide by String)
		System.out.println();


		System.out.println("Modulo");
		System.out.println("Byte : " + (a%b));
		System.out.println("Short : " + (c%d));
		System.out.println("Char : " + (e%f));
		System.out.println("Int : " + (g%h));
		System.out.println("long : " + (i%j));
		System.out.println("Float : " + (k%l));
		System.out.println("Double : " + (m%n));
		//System.out.println("String: " + (o%p));	//CTE-bad operand type for binary operator % (String cannot be Modulo by String)
		System.out.println();

	}
}