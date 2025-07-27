import java.util.Arrays;
class _12FindAmstrongElementsInAnArray
{
	public static void main(String[] args) {
		int [] arr = { 71, 8, 9, 153,70, 371};

		for(int ele : arr)
		{
			if(isAmstrong(ele))
				System.out.print(ele + " ");
		}
	}

	public static boolean isAmstrong(int ele)
	{
		int pow = findLength(ele);
		int sum = 0;

		for(int i = ele; i>0; i/=10)
		{
			int dgt = i%10;
			sum += findPower(dgt, pow);
		}
		return ele == sum;
	}

	public static int findPower(int dgt, int pow)
	{
		int po = 1;
		for(int i = 0; i<pow; i++)
		{
			po *= dgt;
		}
		return po;
	}

	public static int findLength(int ele)
	{
		int cnt = 0;
		while(ele != 0)
		{
			cnt++;
			ele/=10;
		}
		return cnt;
	}
}