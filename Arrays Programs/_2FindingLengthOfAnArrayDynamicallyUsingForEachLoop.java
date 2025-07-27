import java.util.*;
class _2FindingLengthOfAnArrayDynamicallyUsingForEachLoop
{
	public static void main(String[] args) {
		int [] arr = {2, 3, 4 ,2 ,5, 7, 5, 7};
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);

		int len = 0;
		for(int ele : arr)
		{
			try{
				int i = ele;
				len ++;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				break;
			}
		}
		System.out.println(len);
	}
}