class _6TypecastingWidening
{

	//byte < short < int < long < float < double
	       // char
	public static void main(String[] args) 
	{
		double d = 10;
		System.out.println(d);

		int i = 'a';
		System.out.println(i);

		float f = 'z';
		System.out.println(f);
		System.out.println();


		//initializing byte values to different datatypes
		short bs = 10;
		System.out.println(bs);

		int bi = 10;
		System.out.println(bi);

		long bl = 10;
		System.out.println(bl);

		float bf = 10;
		System.out.println(bf);

		double bd = 10;
		System.out.println(bd);

		char bc = 10;
		System.out.println(bc);


		//initializing short type values to different datatypes
		short ss = 32767;
		System.out.println(ss);

		int si = 32767;
		System.out.println(si);

		long sl = 32767;
		System.out.println(sl);

		float sf = 32767;
		System.out.println(sf);

		double sd = 32767;
		System.out.println(sd);
		System.out.println();

		
		//initializing char values to different datatype
		char cc = 'a';
		System.out.println(cc);

		short cs = 'a';
		System.out.println(cs);

		int ci = 'a';
		System.out.println(ci);

		long cl = 'a';
		System.out.println(cl);

		float cf = 'a';
		System.out.println(cf);

		double cd = 'a';
		System.out.println(cd);
		System.out.println();


		//initializing int values to diffrent datatypes
		int ii = 2147483647;
		System.out.println(ii);

		long il = 2147483647;
		System.out.println(il);

		float fi = 2147483647;
		System.out.println(fi);

		double id = 2147483647;
		System.out.println(id);
		System.out.println();


		//initializing long values to different datatypes
		long ll = 9876543210l;
		System.out.println(ll);

		float lf = 987654321;
		System.out.println(lf);

		double ld = 987654321;
		System.out.println(ld);
		System.out.println();


		//initializing float values to different datatypes
		float ff = 123f;
		System.out.println(ff);

		double fd = 124f;
		System.out.println(fd);
		
	}
}