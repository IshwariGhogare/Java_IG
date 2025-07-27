import java.util.*;
class _3PrintingOneDimensionalArrayDynamically
{
	public static void main(String[] args) {
		int [] arr = { 1,2,3,4,5};
		System.out.println(Arrays.toString(arr));

		//Forward Traversing
		for(int i = 0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		//Backward Traversing
		for(int i = arr.length-1; i>=0; i--)
		{
			System.out.print(arr[i] + " ");
		}
	}
}