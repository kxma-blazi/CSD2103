public class selectionSort {
	// selection sort = O(n^2)
	// small data set = Nice
	// large data set = Bad

	public static void main(String[] args) {

		int array[] = {9, 1, 8, 2, 7, 3, 6, 4, 5};

		selectionSort(array);


		for(int i : array) {
			System.out.print(i);
		}
	}

	private static void selectionSort(int[] array) {

		for (int i = 0; i < array.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < array.length; j++) {
				if(array[min] > array[j]) {
					min = j;
				}
			}

			int temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		} 
	}
}

// THANKS Bro Code