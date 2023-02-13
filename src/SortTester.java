import java.util.Arrays;

public class SortTester
{
	public static void main(String[] args)
	{
		int[] arr1 = {-20, -5, -4, 0, 3, 6, 12, 13, 14, 19, 40, 54, 77, 86, 89, 100};
		int[] arr2 = {-20, -5, -4, 0, 3, 6, 12, 13, 14, 19, 40, 54, 77, 86, 89, 100};

		/* --- SELECTION SORT --- */
		Sort.selectionSort(arr1);
		System.out.println(Arrays.toString(arr1));

		/* --- INSERTION SORT --- */ 
		Sort.insertionSort(arr2);
		System.out.println(Arrays.toString(arr2));
	}
}
