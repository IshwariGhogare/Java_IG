class _1FindingLengthOfAnArrayDynamicallyUsingForLoop
{
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8,9};
		System.out.println(arr.length);

		int len = 0;
		for(int i = 0; true; i++)
		{
			try 
			{
				int a = arr[i];
			    len++;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				break;	
			}	
		}
		System.out.println(len);
	}
}