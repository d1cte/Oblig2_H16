package Task3;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
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
	private static BST<Integer> tree2;
	private static ArrayList<Integer> preorderIteratorList;
	private static Integer[] numbers = {60, 
									55, 100, 
								45, 57, 67, 107};
	
	@Before
	public void setUp() {
		tree = new BST<>(numbers);
		tree2 = new BST<>(numbers);
	}

	@Test
	public void treeWithOneElementParentShouldBeNull() {
		BST<Integer> emptyTree = new BST<>();
		emptyTree.insert(2);
		assertNull(emptyTree.getRoot().parent);
	}
	
	@Test
	public void afterInsertParentShouldBeSet() {
		assertNull(tree.getNode(60).parent);
		assertThat(tree.getNode(55).parent, is(tree.getRoot()));
		assertThat(tree.getNode(100).parent, is(tree.getRoot()));
		assertThat(tree.getNode(45).parent, is(tree.getNode(55)));
		assertThat(tree.getNode(107).parent, is(tree.getNode(100)));
	}	
	
	@Test
	public void deleteCase1ShouldHaveCorrectParent() {
		assertTrue(tree2.delete(45));
		assertThat(tree2.getNode(55).parent, is(tree2.getNode(60)));

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
	
	@Test
	public void getPathShouldReturnArrayListWithElements() {
		List<Integer> path1 = Arrays.asList(67, 100, 60);
		List<Integer> path2 = Arrays.asList(57, 55, 60);

		assertEquals(path1, tree.getPath(67));
		assertEquals(path2, tree.getPath(57));
	}



}
