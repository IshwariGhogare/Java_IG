class _7TypecastingNarrowing
{
	public static void main(String[] args) 
	{
		float f = 20.345f;
		System.out.println((int)f);

		int i = 120;
		System.out.println((char)i);

		int iii = (int)f;
		System.out.println(iii);
		
		char ch = (char)1234.352362f;
		System.out.println(ch);

		byte b = (byte)5334l;
		System.out.println(b);

		byte bt = -100;
		char c = (char)bt;
		System.out.println(c);
		System.out.println();


		//Narrowing short values in other datatypes
		short ss = 99;
		System.out.println(ss + "---------------");

		byte sb = (byte)ss;
		System.out.println(sb);

		char sc = (char)ss;
		System.out.println(sc);
		System.out.println();


		//Narrowing char values in other datatype
		char cc = 'a';
		System.out.println(cc + "----------------");

		byte cb = (byte)cc;
		System.out.println(cb);

		short cs = (short)cc;
		System.out.println(cs);
		System.out.println();


		//Narrowing int values in other datatype
		int ii = 14;
		System.out.println(ii + "----------------------");

		byte ib = (byte)ii;
		System.out.println(ib);

		short is = (short)ii;
		System.out.println(is);

		char ic = (char)ii;
		System.out.println(ic);
		System.out.println();


		//Narrowing long values in other datatype
		long ll = 9876543210l;
		System.out.println(ll + "----------------");

		byte lb = (byte)ll;
		System.out.println(lb);

		short ls = (short)ll;
		System.out.println(ls);

		char lc = (char)ll;
		System.out.println(lc);

		int li = (int)ll;
		System.out.println(li);
		System.out.println();


		//Narrowing float values in other datatype
		float ff = 98765.4321f;
		System.out.println(ff + "----------------------");

		byte fb = (byte)ff;
		System.out.println(fb);

		short fs = (short)ff;
		System.out.println(fs);

		char fc = (char)ff;
		System.out.println(fc);

		int fi = (int)ff;
		System.out.println(fi);

		long lf = (long)ff;
		System.out.println(lf);
		System.out.println();


		//Norrowing double values in other datatype
		double dd = 987654.21322;
		System.out.println(dd + "-------------------");

		byte db = (byte)dd;
		System.out.println(db);

		short ds = (short)dd;
		System.out.println(ds);

		char dc = (char)dd;
		System.out.println(dc);

		int di = (int)dd;
		System.out.println(di);

		long dl = (long)dd;
		System.out.println(dl);

		float df = (float)dd;
		System.out.println(df);

	}
}