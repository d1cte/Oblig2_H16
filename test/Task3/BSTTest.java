package Task3;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import java.util.Arrays;
import java.util.List;
import org.hamcrest.Matcher;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.hamcrest.Matcher;

public class BSTTest {
	private BST<Integer> tree;
	private Integer[] numbers = {60, 55, 100, 45, 57, 67, 107, 59, 101};
	
	@Before
	public void setUp() {
		tree = new BST<>(numbers);
	}

	@Test
	public void getNodeFirstElementShouldReturnRoot() {
		assertThat(tree.getNode(60), is(tree.getRoot()));
	}

}
