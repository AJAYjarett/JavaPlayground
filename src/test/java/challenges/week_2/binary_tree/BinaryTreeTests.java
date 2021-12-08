package challenges.week_2.binary_tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinaryTreeTests {

    BinaryTree binaryTree = new BinaryTree(5);

    @Test
    public void binaryTreeTests(){
        binaryTree.addElement(4);
        binaryTree.addElement(8);
        binaryTree.addElements(new int[] {9,3,12,17,10,32,30,26});
        Assertions.assertEquals(binaryTree.getNumberOfElements(), 11);
        Assertions.assertEquals(binaryTree.getRootElement(), 5);
        Assertions.assertArrayEquals(binaryTree.getSortedTreeAsc(), new int[] {3,4,5,8,9,10,12,17,26,30,32});
        Assertions.assertArrayEquals(binaryTree.getSortedTreeDesc(), new int[] {32,30,26,17,12,10,9,8,5,4,3});
        Assertions.assertEquals(binaryTree.findElement(10), true);
    }
}
