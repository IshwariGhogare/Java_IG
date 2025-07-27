import java.util.*;
class _15InitializeAnArrayUsingMathRandomFunction
{
	public static void main(String[] args) {
		int [] arr = new int[10];
		System.out.println("Before Initializing : "  +Arrays.toString(arr));

		for(int i = 0; i<arr.length; i++)
		{
			int ele = (int)(Math.random()*999);
			if(ele < 100) 
				i--;

			arr[i] = ele;
		}
		System.out.println(" After Initializing : " + Arrays.toString(arr));
	}
}