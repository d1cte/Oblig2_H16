package Task2;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import java.util.Arrays;
import java.util.List;
import static Task1.GenericMergeSort.*;

import org.hamcrest.Matcher;
import org.junit.Test;

public class MyLinkedListTest {

	
	@Test
	public void getOnEmptyListShouldReturnNull() {
		MyLinkedList<String> list = new MyLinkedList<>();		
		assertNull(list.get(0));
		
	}
	@Test
	public void getShouldReturnElementAtIndex() {
		MyLinkedList<String> list = new MyLinkedList<>();
		list.add("Anna");
		list.add("Beate");
		list.add("Cathrine");
		
		assertThat(list.get(0), is("Anna"));
		assertThat(list.get(1), is("Beate"));
		assertThat(list.get(2), is("Cathrine"));
	}

	@Test
	public void indexOfShouldReturnCorrectIndex() {
		MyLinkedList<String> list = new MyLinkedList<>();
		list.add("Anna");
		list.add("Beate");
		list.add("Cathrine");
		
		assertThat(list.indexOf("Anna"), is(0));
		assertThat(list.indexOf("Beate"), is(1));
		assertThat(list.indexOf("Cathrine"), is(2));
	}
	
	@Test
	public void indexOfWithNoMatchShouldReturnNegativeNum() {
		MyLinkedList<String> list = new MyLinkedList<>();
		list.add("Anna");
		list.add("Anna2");
		
		assertThat(list.indexOf("anna"), is(-1));
		assertThat(list.indexOf("Sofie"), is(-1));
	}
	
	@Test
	public void containsWithNoMatchShouldReturnFalse() {
		MyLinkedList<String> list = new MyLinkedList<>();
		list.add("Anna");
		list.add("Anna2");
		
		assertFalse(list.contains("anna"));
		assertFalse(list.contains("Sofie"));
	}
	
	@Test
	public void containsWithMatchShouldReturnTrue() {
		MyLinkedList<String> list = new MyLinkedList<>();
		list.add("Anna");
		list.add("Sofie");
		
		assertTrue(list.contains("Anna"));
		assertTrue(list.contains("Sofie"));
	}
	
	@Test
	public void lastIndexOfWithNoMatchShouldReturnNegativeNum() {
		MyLinkedList<String> list = new MyLinkedList<>();
		list.add("Anna");
		list.add("Anna2");
		
		assertThat(list.lastIndexOf("anna"), is(-1));
		assertThat(list.lastIndexOf("Sofie"), is(-1));
	}
	
	@Test
	public void lastIndexOfWithMatchShouldReturnLastIndex() {
		MyLinkedList<String> list = new MyLinkedList<>();
		list.add("Anna");
		list.add("Sofie");
		list.add("Anna");
		list.add("Sofie");
		
		assertThat(list.lastIndexOf("Anna"), is(2));
		assertThat(list.lastIndexOf("Sofie"), is(3));
	}
	
	@Test
	public void setShouldReplaceElementAtIndex() {
		MyLinkedList<String> list = new MyLinkedList<>();
		list.add("Anna");
		list.add("Anna");
		list.add("Anna");
		list.add("Anna");
		list.add("Anna");
		list.add("Anna");
		assertNotNull(list.set(2, "Maria"));
		assertNotNull(list.set(5, "Sofie"));
		
		assertThat(list.get(2), is("Maria"));
		assertThat(list.get(5), is("Sofie"));
	}
	@Test
	public void setWithIndexOutOfBondsShouldReturnNull() {
		MyLinkedList<String> list = new MyLinkedList<>();
		list.add("Anna");
		assertNull(list.set(7, "Sofie"));
		assertNull(list.set(-1, "Sofie"));

	}




}
