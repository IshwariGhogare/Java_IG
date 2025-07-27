import java.util.Arrays;
class _18FindPrimeElementsFromAnArray
{
	public static void main(String[] args) {
		int [] arr = {1, 2, 5, 7, 8, 9, 11, 13, 54, 72, 91, 53, 23};
		System.out.println(Arrays.toString(arr));

		for(int ele : arr)
			if(isPrime(ele))
				System.out.print(ele + " ");
	}

	public static boolean isPrime(int ele)
	{
		if(ele<2) return false;

		for(int i = 2; i<=ele/2; i++)
			if(ele%i == 0) return false;
		return true;
	}
}