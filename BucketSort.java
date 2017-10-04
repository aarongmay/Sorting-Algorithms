import java.util.List;

/**
 * Standard implementation of Bucket Sort for list of Integers.
 * @author Aaron May
 *
 */
public class BucketSort{

	/**
	 * Bucket sort algorithm to sort integers
	 * @param listToSort List to sorted
	 * @param maxValue   Maximum value within list to be sorted
	 */
	public void sort(List<Integer> listToSort, int maxValue) {
		int[] bucket = new int[maxValue + 1];//buckets to store each value in, including value of 0

		//initialize each bucket with count of 0
		for (int i = 0; i < bucket.length; i++) {
			bucket[i] = 0;
		}

		//total the amount of integers within each bucket
		for (int i = 0; i < listToSort.size(); i++) {
			bucket[listToSort.get(i)]++;
		}

		//stores each bucket into list in order
		int counter = 0;
		for (int i = 0; i< bucket.length; i++) {
			for (int j = 0; j < bucket[i]; j++) {
				listToSort.set(counter++, i);
			}
		}
	}
	
	/**
	 * Return maximum value contained within list
	 * @param listToSearch List to extract maximum value from
	 * @return			   Maximum value within list
	 */
	public int getListMaxValue(List<Integer> listToSearch) {
        int maxValue = 0;
        for (int i = 0; i < listToSearch.size(); i++)
            if (listToSearch.get(i) > maxValue)
                maxValue = listToSearch.get(i);
        return maxValue;
	}
}