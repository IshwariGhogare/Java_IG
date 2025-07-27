import java.util.Arrays;
class _19FindPalindromElementsFromAnArray
{
	public static void main(String[] args) {
		int [] arr = { 2, 55, 121, 74, 878, 0, 99099, 111, 90, 57};
		System.out.println(Arrays.toString(arr));

		for(int ele : arr)
			if(isPalindrom(ele))
				System.out.print(ele + " ");
	}

	public static boolean isPalindrom(int ele)
	{
		int temp = ele;
		int rev = 0;
		for(int i = ele; i>0; i/=10)
			rev = rev*10 + i%10;
		return rev == ele;
	}
}