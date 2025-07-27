import java.util.Arrays;
class _20FindPalindromeStringElementsFromAnArray
{
	public static void main(String[] args) 
	{
		String [] arr = { "mango", "nayan", "satan", "null", "nan", "madam", "mam", "pop"};
		System.out.println(Arrays.toString(arr));	

		for(String ele : arr)
			if(isPalindrome(ele))
				//if(isPalindrome1(ele))
				System.out.print(ele + " ");
	}

	public static boolean isPalindrome(String ele)
	{
		String rev = "";
		for(int i = ele.length()-1; i>=0; i--)
			rev += ele.charAt(i);
		return rev.equals(ele);
	}

	public static boolean isPalindrome1(String ele)
	{
		return ele.contentEquals(new StringBuffer(ele).reverse());
	}
}