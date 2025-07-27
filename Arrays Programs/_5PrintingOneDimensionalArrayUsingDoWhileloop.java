import java.util.Arrays;
class _5PrintingOneDimensionalArrayUsingDoWhileloop
{
	public static void main(String[] args) {
		
	int [] arr = {1,3,3,4,5,6};
	System.out.println(Arrays.toString(arr));

	//Forward Traversing
	int i = 0;
	do{
		System.out.print(arr[i] + " ");
		i++;
	}
	while(i < arr.length);
	System.out.println();


	//Backward Traversing
	i = arr.length-1;
	do{
		System.out.print(arr[i] + " ");
		i--;
	}
	while(i>=0);
	}
}