import java.util.ArrayList;

public class Sort
{
	// Part A.  Which Sort is Which?
	public static void selectionSort(int[] elements)
	{
		int compares = 0;
		for (int j = 0; j < elements.length - 1; j++)
		{
			int minIndex = j;
			for (int k = j + 1; k < elements.length; k++)
			{      
				if (elements[k] < elements[minIndex])
				{
					minIndex = k;
				}
				compares++;
			}
			int temp = elements[j];
			elements[j] = elements[minIndex];
			elements[minIndex] = temp;
		}
		System.out.println(compares + " comparisons");
	}

	public static void insertionSort(int[] elements)
	{ 
		int compares = 0;
		for (int j = 1; j < elements.length; j++)
		{
			int temp = elements[j];
			int possibleIndex = j;
			while (possibleIndex > 0 && temp < elements[possibleIndex - 1])
			{     
				compares++;
				elements[possibleIndex] = elements[possibleIndex - 1];
				possibleIndex--;
			}
			elements[possibleIndex] = temp;
		}
		System.out.println(compares + " comparisons");
	}

	// Part C.  Sorting a 1000-word list!
	public static void selectionSortWordList(ArrayList<String> words)
	{
		for (int i = 0; i < words.size(); i++) {
			int k = i;
			for (int j = i + 1; j < words.size(); j++) {
				if (words.get(k).compareTo(words.get(j)) > 0) {
					k = j;
				}
			}
			words.set(i, words.set(k, words.get(i)));
		}
	}

	public static void insertionSortWordList(ArrayList<String> words)
	{    
		for (int i = 1; i < words.size(); i++) {
			int k = i;
			String kStr = words.get(i);
			while (k > 0 && words.get(k - 1).compareTo(kStr) > 0) {
				words.set(k, words.get(k - 1));
				k--;
			}
			words.set(k, kStr);
		}
	}
}
