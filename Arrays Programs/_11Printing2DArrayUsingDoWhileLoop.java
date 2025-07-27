import java.util.Arrays;
class _11Printing2DArrayUsingDoWhileLoop
{
	public static void main(String[] args) {
		int [][] arr = {{1,2,3,4,4}, {6,7,8}};
		System.out.println(Arrays.deepToString(arr));

		int i = 0;
		do{
			int j = 0;
			do{
				System.out.print(arr[i][j] + " ");
				j++;
			}
			while(j < arr[i].length);
			System.out.println();

			i++;
		}
		while(i< arr.length);
	}
}