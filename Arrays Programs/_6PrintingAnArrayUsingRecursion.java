import java.util.Arrays;
class _6PrintingAnArrayUsingRecursion
{
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,4,5};
		System.out.println(Arrays.toString(arr));

		printArray(arr, 0, arr.length-1);
		System.out.println();
		int range = 0;
		printReverseArray(arr, arr.length-1, range);
	}

    //Forward Traversing
	public static void printArray(int [] arr, int i, int len)
	{
		System.out.print(arr[i] + " ");
		if(i == len) return;
		printArray(arr, ++i, len );
	}


	//Backward Traversing
	public static void printReverseArray(int [] arr , int i , int len)
	{
		System.out.print(arr[i] + " ");
		if(i == len) return;
		printReverseArray(arr, --i, len);
	}
}