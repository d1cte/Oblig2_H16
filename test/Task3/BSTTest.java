package Task3;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.hamcrest.Matcher;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.hamcrest.Matcher;

public class BSTTest {
	private static BST<Integer> tree;
	private static Integer[] numbers = {60, 
									55, 100, 
								45, 57, 67, 107};
	@BeforeClass
	public static void setUp() {
		tree = new BST<>(numbers);
	}

	@Test
	public void treeWithOneElementParentShouldBeNull() {
		BST<Integer> emptyTree = new BST<>();
		emptyTree.insert(2);
		assertNull(emptyTree.getRoot().parent);
	}
	
	@Test
	public void afterInsertParentShouldBeSet() {
		BST<Integer> tree2 = new BST<>();
		tree2.insert(60);
		assertNull(tree2.getNode(60).parent);
		
		tree2.insert(55);
		assertThat(tree2.getNode(55).parent, is(tree2.getRoot()));
		
		tree2.insert(100);
		assertThat(tree2.getNode(100).parent, is(tree2.getRoot()));
	
		tree2.insert(45);
		assertThat(tree2.getNode(45).parent, is(tree2.getNode(55)));
		
		tree2.insert(107);
		assertThat(tree2.getNode(107).parent, is(tree2.getNode(100)));
	}	
	
	@Test
	public void getNodeWithElementNotInTreeShouldReturnNull() {
		assertNull(tree.getNode(700));
	}
	
	@Test
	public void getNodeFirstElementShouldReturnRoot() {
		assertThat(tree.getNode(60), is(tree.getRoot()));
	}
	
	@Test
	public void isLeafTreeWithOneNodeShouldReturnTrue() {
		BST<Integer> emptyTree = new BST<>();
		emptyTree.insert(2);
		assertTrue(emptyTree.isLeaf(2));
	}
	
	@Test
	public void isLeafShouldReturnTrue() {
		assertTrue(tree.isLeaf(45));
		assertTrue(tree.isLeaf(57));
		assertTrue(tree.isLeaf(107));
	}
	
	@Test
	public void isLeafShouldReturnFalse() {
		assertFalse(tree.isLeaf(55));
		assertFalse(tree.isLeaf(100));
		assertFalse(tree.isLeaf(60));
	}

}
