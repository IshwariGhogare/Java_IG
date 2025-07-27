import java.util.Arrays;
class _16InitializeCharArrayWithRandomUniqueValues
{
	public static void main(String[] args) {
		char [] arr = new char[10];
		System.out.println(Arrays.toString(arr));

		for(int i = 0; i<arr.length; )
		{
			char ch = (char)(Math.random()*99);
			if(ch >= 65 && ch <= 90)
				if(!(checkCharacter(arr, ch)))
					arr[i++] = ch;
		}
		System.out.println(arr);
	}

	public static boolean checkCharacter(char [] arr, char ch)
	{
		for(char ele : arr)
			if(ele == ch) return true;
		return false;
	}	
}