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
	private static Integer[] numbers = {60, 55, 100, 45, 57, 67, 107};
	
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
	
//	@Test
//	public void afterInsertParentShouldBeSet() {
//		assertThat(tree.getNode(59).parent, is(tree.getNode(57)));
//	}
	
	@Test
	public void getNodeWithElementNotInTreeShouldReturnNull() {
		assertNull(tree.getNode(700));
	}
	
	@Test
	public void getNodeFirstElementShouldReturnRoot() {
		assertThat(tree.getNode(60), is(tree.getRoot()));
	}

}
