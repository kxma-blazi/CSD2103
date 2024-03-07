package CaseFromGFG;
public class CFH { 
	static int getsum(int arr[], int n)
	{
		if (n % 2 == 0) // if (n) is even
		{
			return 0;
		}
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}
		return sum; // if (n) is odd
	}

	/* Driver's code*/
	public static void main(String[] args)
	{
		int arr1[]
			= { 1, 2, 3,
				4 }; // Declaring an array of even length
		int n1 = arr1.length;

		int arr2[]
			= { 1, 2, 3, 4,
				5 }; // Declaring an array of odd length
		int n2 = arr2.length;

		// Function call
		System.out.println(getsum(
			arr1, n1)); // print 0 because (n) is even
		System.out.println(getsum(
			arr2,
			n2)); // print sum of array because (n) is odd
	}
} // This code is contributed by Syed Maruf Ali (Sdmrf)

//  if 'n' is Even: O(1) [คู่]
//  if 'n' is Odd: O(n) [คี่]
/*
Output:
0
15
 */
/*
  * Best Case: O(1)
  * Average Case: O(n)
  * Worst Case: O(n) 
  */