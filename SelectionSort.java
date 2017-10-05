import java.util.List;

/**
 * Standard implementation of Selection Sort for a list of Integers
 * @author Aaron May
 *
 */
public class SelectionSort {

	/**
	 * Sort list of Integers using Selection Sort
	 * @param listToSort List to be sorted
	 */
	public void sort(List<Integer> listToSort){
		
		//loop through all list value
		for (int i = 0; i < listToSort.size() - 1; i++) {
			int index = i;//store value position to be swapped if required
			
			//loop through all list values looking for one that is lower than that of position index
			for (int j = i + 1; j < listToSort.size(); j++) {
				if (listToSort.get(j) < listToSort.get(index)) {
					index = j;
				}
			}
			
			//swap values at position index and i if required
			if (index != i) {
				int temp = listToSort.get(index);  
				listToSort.set(index, listToSort.get(i));
				listToSort.set(i, temp);			
			}
		}
	}
}