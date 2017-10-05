import java.util.List;

/**
 * Standard implementation of Bubble Sort for list of Integers.
 * @author Aaron May
 *
 */
public class BubbleSort {  
	
	/**
	 * Bubble sort algorithm to sort integers
	 * @param listToSort List of Integers to sort
	 */
	public void sort(List<Integer> listToSort) {  
		int temp = 0;  

		//loop through list comparing i and i + 1 and swapping values if required until list sorted
		for(int i = 0; i < listToSort.size(); i++){  
			for(int j = 1; j < (listToSort.size() - i); j++){  
				if(listToSort.get(j-1) > listToSort.get(j)){  
					temp = listToSort.get(j-1);  
					listToSort.set(j-1, listToSort.get(j));  
					listToSort.set(j, temp);  
				}  
			}  
		}  
	}  
} 