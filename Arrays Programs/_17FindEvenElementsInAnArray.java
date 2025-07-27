import java.util.Arrays;
class _17FindEvenElementsInAnArray
{
	public static void main(String[] args) {
		int [] arr = { 2, 6, 7, 9, 0, 1, 75, 54, 73, 91, 100};
		System.out.println(Arrays.toString(arr));

		for(int ele : arr)
			if(isEven(ele) && ele != 0)
				System.out.print(ele + " ");
	}

	public static boolean isEven(int ele)
	{
		return (ele%2 == 0)? true : false;
	}
}