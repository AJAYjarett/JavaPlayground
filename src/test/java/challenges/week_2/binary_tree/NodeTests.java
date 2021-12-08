package challenges.week_2.binary_tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NodeTests {

    Node node = new Node(8);
    Node leftTestNode = new Node(6);


    @Test
    public void nodeTests(){
        node.setLeftChild(leftTestNode);
        Assertions.assertEquals(node.getValue(), 8);
        Assertions.assertEquals(node.isLeftChildEmpty(), false);
        Assertions.assertEquals(node.isRightChildEmpty(), true);
        Assertions.assertEquals(node.getLeftChild(), leftTestNode);

    }
}
