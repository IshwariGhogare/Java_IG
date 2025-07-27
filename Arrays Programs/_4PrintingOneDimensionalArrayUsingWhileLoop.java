import java.util.Arrays;
class _4PrintingOneDimensionalArrayUsingWhileLoop
{
	public static void main(String[] args) {
		int [] arr = { 1, 2 ,4 ,5 ,6};
		System.out.println(Arrays.toString(arr));

        //Forward Traversing
		int i = 0;
		while(i<arr.length)
		{
			System.out.print(arr[i] + " ");
			i++;
		}
		System.out.println();


		//Backward Traversing
		i = arr.length-1;
		while(i>=0)
		{
			System.out.print(arr[i] + " ");
			i--;		}

	}
}