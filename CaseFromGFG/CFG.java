package CaseFromGFG;
// Java implementation of the Linear Serch Algo
public class CFG {

	// Linearly search x in arr[]. If x is present then
	// return the index, otherwise return -1
	static int search(int arr[], int n, int x)
	{
		int i;
		for (i = 0; i < n; i++) {
			if (arr[i] == x) {
				return i;
			}
		}
		return -1;
	}

	/* Driver's code*/
	public static void main(String[] args)
	{
		int arr[] = { 1, 10, 30, 15 };
		int x = 30;
		int n = arr.length;

		// Function call
		System.out.printf("%d is present at index %d", x,
						search(arr, n, x));
	}
}

/*
Output:
    30 is present at index 2
 */

 /*
  * Best Case: O(1)
  * Average Case: O(n)
  * Worst Case: O(n)
  */