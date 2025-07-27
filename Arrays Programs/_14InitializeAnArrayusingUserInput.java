import java.util.*;
class _14InitializeAnArrayusingUserInput
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of an array : ");
		int size = sc.nextInt();

		int [] arr = new int[size];

		for(int i = 0; i<arr.length; i++)
		{
			System.out.println("Enter the " + (i+1) + " element of an Array : ");
			arr[i] = sc.nextInt();
		}

		System.out.println(Arrays.toString(arr));
	}
}