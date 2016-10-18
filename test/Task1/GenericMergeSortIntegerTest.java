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
	

}