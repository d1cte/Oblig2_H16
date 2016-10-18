package Task1;

import java.util.Comparator;


public class GenericMergeSort {
	public static <E extends Comparable<E>> void mergeSort(E[] list) {
		if(list.length > 1) {
			// Sort the first half
			@SuppressWarnings("unchecked")
			E[] firstHalf = (E[])new Comparable[list.length / 2];
			System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
			mergeSort(firstHalf);
			
			// Sort the second half
			int lengthSecondHalf = list.length - list.length / 2;
			
			@SuppressWarnings("unchecked")
			E[] secondHalf = (E[])new Comparable[lengthSecondHalf];
			System.arraycopy(list, list.length / 2, secondHalf, 0, lengthSecondHalf);
			mergeSort(secondHalf);
			
			// Merge firstHalf with secondHalf into list
			merge(firstHalf, secondHalf, list);
		}
	}
	
	/** Merge two sorted lists **/
	private static <E extends Comparable<E>> void merge(E[] list1, E[] list2, E[] temp) {
		int currentIndexList1 = 0;
		int currentIndexList2 = 0;
		int currentIndexTemp = 0;

		
		while(currentIndexList1 < list1.length && currentIndexList2 < list2.length) {
			if((list1[currentIndexList1]).compareTo(list2[currentIndexList2]) < 0)
				temp[currentIndexTemp++] = list1[currentIndexList1++];
			else
				temp[currentIndexTemp++] = list2[currentIndexList2++];
		}
		
		while(currentIndexList1 < list1.length) 
			temp[currentIndexTemp++] = list1[currentIndexList1++];
		while(currentIndexList2 < list2.length)
			temp[currentIndexTemp++] = list2[currentIndexList2++];
	}
}
