import java.util.List;

/**
 * Standard implementation of Insertion Sort for a list of Integers
 * @author Aaron May
 *
 */
public class InsertionSort {
     
    /**
     * Sort list of Integers using Insertion sort
     * @param listToSort List to be sorted
     */
    public void sort(List<Integer> listToSort){
        for (int i = 1; i < listToSort.size(); i++) {
        	
        	//loop through current "ordered" list
        	for(int j = i ; j > 0; j--){
                if(listToSort.get(j) < listToSort.get(j-1)){
                	
                	//swap values at position j and j-1
                    int temp = listToSort.get(j);
                    listToSort.set(j, listToSort.get(j-1));
                    listToSort.set(j-1, temp);
                }
            }
        }
    }
}