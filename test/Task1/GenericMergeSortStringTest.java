package Task1;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import java.util.Arrays;
import java.util.List;
import static Task1.GenericMergeSort.*;

import org.hamcrest.Matcher;
import org.junit.Test;


public class GenericMergeSortStringTest {	
	@Test
	public void ArrayWithSingleCharStringsShouldGetSorted() {
		String[] stringArray = {"a", "c", "b"};
		String[] stringArraySorted = {"a", "b", "c"};
		
		mergeSort(stringArray);
		assertThat(stringArray, is(stringArraySorted));
	}
	
	@Test
	public void ArrayWithWordsShouldGetSorted() {
		String[] stringArray = {"catherine", "leo", "beatrice"};
		String[] stringArraySorted = {"beatrice", "catherine", "leo"};
		
		mergeSort(stringArray);
		assertThat(stringArray, is(stringArraySorted));
	}
	
	@Test
	public void ArrayWithSentencesShouldGetSorted() {
		String[] stringArray = {
				"Hello, my name is ", 
				"how are you?", 
				"After this im done"
		};
		String[] stringArraySorted = {
				"After this im done", 
				"Hello, my name is ", 
				"how are you?"
		};
		
		mergeSort(stringArray);
		assertThat(stringArray, is(stringArraySorted));
	}

}