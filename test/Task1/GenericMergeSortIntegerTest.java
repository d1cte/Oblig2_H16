package Task1;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import java.util.Arrays;
import java.util.List;
import static Task1.GenericMergeSort.*;

import org.hamcrest.Matcher;
import org.junit.Test;


public class GenericMergeSortIntegerTest {	
	@Test
	public void ArrayWithTwoElemtsShouldGetSorted() {
		Integer[] intArray = {2, 1};
		Integer[] intArraySorted = {1, 2};
		
		mergeSort(intArray);
		assertThat(intArray, is(intArraySorted));
	}
	
	@Test
	public void ArrayWithFiveElemtsShouldGetSorted() {
		Integer[] intArray = {2, 1, 5, 3, 4};
		Integer[] intArraySorted = {1, 2, 3, 4, 5};
		
		mergeSort(intArray);
		assertThat(intArray, is(intArraySorted));
	}
	
	@Test
	public void ArrayWithNegativeElemtsShouldGetSorted() {
		Integer[] intArray = {2, 1, -5, 3, 4};
		Integer[] intArraySorted = {-5, 1, 2, 3, 4};
		
		mergeSort(intArray);
		assertThat(intArray, is(intArraySorted));
	}
	

}