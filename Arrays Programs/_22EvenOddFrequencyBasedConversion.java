import java.util.Arrays;
class _22EvenOddFrequencyBasedConversion
{
	public static void main(String[] args) 
	{
		int [] arr = {1, 3, 2, 6, 7,0, 0, 9, 32, 33, 37,2,2, 28};
		System.out.println(Arrays.toString(arr));

		int evenCount = 0;
		int oddCount = 0;

		for(int ele : arr)
			{
				if(ele%2 == 0)
					evenCount ++;
				else oddCount++;
			}

		System.out.println("Even Count is :" + evenCount);
		System.out.println("Odd Count is : " + oddCount);
	
        int [] ar = new int[arr.length];
		ar = convertEvenOdd(arr, evenCount, oddCount);
		System.out.println(Arrays.toString(ar));	

	}

	public static int [] convertEvenOdd(int [] arr, int evenCount, int oddCount)
	{
		int [] temp = new int[arr.length];
		
		for(int i = 0; i<arr.length; i++)
		{
			if(evenCount > oddCount)
		    {
		    	if(arr[i]%2 != 0)
					temp[i] = arr[i]+1;
				else
					temp[i] = arr[i];
			}

			else if(evenCount < oddCount)
		    {
				if(arr[i] % 2 == 0)
					temp[i] = arr[i]+1;
				else
					temp[i] = arr[i];
			}

			else
			{
				if(arr[0]%2 == 0)
					if(arr[i]%2 != 0)
						temp[i] = arr[i]+1;
					else
						temp[i]= arr[i];
				else
					if(arr[i]%2 == 0)
					    temp[i] = arr[i]+1;
					else
						temp[i] = arr[i];
			}
		}
		return temp;

	}
}