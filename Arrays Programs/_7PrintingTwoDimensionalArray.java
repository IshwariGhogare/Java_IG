import java.util.Arrays;
class _7PrintingTwoDimensionalArray
{
	public static void main(String[] args) {
		int [][] arr = {{1,2,3,}, {4,5,6,7}};

		for(int i = 0; i<arr.length; i++)
		{
			System.out.println(Arrays.toString(arr[i]));
		}
	}
}