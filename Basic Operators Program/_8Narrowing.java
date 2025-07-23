class _8Narrowing
{
	public static void main(String[] args) 
	{
		System.out.println((int)20.345);
		System.out.println((char)120);

		int i = (int)20.34;
		System.out.println(i);

		char ch = (char)56.456456f;
		System.out.println(ch);

		byte b = (byte)126733725l;
		System.out.println(b);

		byte bt = -100;
		char c = (char)bt;
		System.out.println(c);
		System.out.println();



		//Narrowing short
		short s = 99;

		byte bb = (byte)s;
		System.out.println(bb);

		char sc = (char)s;
		System.out.println(sc);
		System.out.println();



		//Narrowing int

		int ii = 20;

		byte ib = (byte)ii;
		System.out.println(ib);

		short is = (short)ii;
		System.out.println(is);

		char ic = (char)ii;
		System.out.println(ic);

		//Narrowing long 

		long l = 53723629l;

		byte lb = (byte)l;
		System.out.println(lb);

		short ls = (short)l;
		System.out.println(ls);

		int li = (int)l;
		System.out.println(li);

		char lc = (char)l;
		System.out.println(lc);
		System.out.println();



		//Narrowing float

		float f = 53.467f;
		System.out.println(f);

		byte fb = (byte)f;
		System.out.println(fb);

		short fs = (short)f;
		System.out.println(fs);

		char fc = (char)f;
		System.out.println(fc);

		int fi = (int)f;
		System.out.println(fi);

		long lf = (long)f;
		System.out.println(lf);
		System.out.println();



		//Narrowing Double

		double d = 53273.3273;
		System.out.println(d);

		byte db = (byte)d;
		System.out.println(db);

		short ds = (short)d;
		System.out.println(ds);

		char dc = (char)d;
		System.out.println(dc);

		int di = (int)d;
		System.out.println(di);

		long dl = (long)d;
		System.out.println(dl);

		float df = (float)d;
		System.out.println(df);

		
	}
}