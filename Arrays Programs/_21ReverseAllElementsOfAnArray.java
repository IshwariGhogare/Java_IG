import java.util.Arrays;
class _21ReverseAllElementsOfAnArray
{
	public static void main(String[] args) {
		int [] arr = {997, 543, 2365, 234, 1234, 54321};
		System.out.println(Arrays.toString(arr));

		for(int ele : arr)
		{
			int e = reverse(ele);
			System.out.print(e + " ");
		}
	}

	public static int reverse(int ele)
	{
		int rev = 0;
		for(int i = ele ; i > 0; i/=10)
			rev = rev*10 + i%10;
		return rev;
	}
}