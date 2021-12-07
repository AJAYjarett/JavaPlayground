package challenges.week_2.binary_tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class BinaryTree implements BinaryTreeI {
    private final Node rootNode;

    public BinaryTree(final int element){
        rootNode = new Node(element);
    }

    public int getRootElement() {
        return rootNode.getValue();
    }

    public int getNumberOfElements() {
        Node node = rootNode;
        return nodeCounter(node);
    }

    private int nodeCounter(Node node){
        if (node == null)return 0;
        return 1 + nodeCounter(node.getLeftChild()) + nodeCounter(node.getRightChild());
    }

    public void addElement(final int element){
        addNodeToTree(rootNode, element);
    }

    public void addElements(int[] elements) {
        for (int e: elements) {
            addNodeToTree(rootNode, e);
        }
    }

    public boolean findElement(final int value){
        Node node = findNode(value);
        if (node != null) return true;
        return false;
    }

    public int[] getSortedTreeAsc() {
        Node node = rootNode;
        ArrayList<Integer> sortedTreeList = treeToArrayList(node);
        Collections.sort(sortedTreeList);
        int[] arrayToSort = new int[sortedTreeList.size()];
        for (int i = 0; i < sortedTreeList.size(); i++) {
            arrayToSort[i] = sortedTreeList.get(i);
        }
        return arrayToSort;
    }

    public int[] getSortedTreeDesc() {
        Node node = rootNode;
        ArrayList<Integer> sortedTreeList = treeToArrayList(node);
        Collections.sort(sortedTreeList, Collections.reverseOrder());
        int[] arrayToSort = new int[sortedTreeList.size()];
        for (int i = 0; i < sortedTreeList.size(); i++) {
            arrayToSort[i] = sortedTreeList.get(i);
        }
        return arrayToSort;
    }

    private ArrayList<Integer> treeToArrayList(Node node){
        ArrayList<Integer> nodeValues = new ArrayList<>();
        nodeValues.add(node.getValue());
        if (node.isLeftChildEmpty() == false) nodeValues.addAll(treeToArrayList(node.getLeftChild()));
        if (node.isRightChildEmpty() == false) nodeValues.addAll(treeToArrayList(node.getRightChild()));
        return nodeValues;
    }

    private Node findNode(int element){
        Node node = rootNode;
        while (node != null){
            if (element == node.getValue()) return node;
            if (element < node.getValue()) node = node.getLeftChild();
            if (element > node.getValue()) node = node.getRightChild();
        }
        return null;
    }


    private void addNodeToTree(Node node, final int element){
        if (element <= node.getValue()){
            if (node.isLeftChildEmpty()) node.setLeftChild(new Node(element));
            else addNodeToTree(node.getLeftChild(), element);
        } else if (element > node.getValue()){
            if (node.isRightChildEmpty()) node.setRightChild(new Node(element));
            else addNodeToTree(node.getRightChild(), element);
        }
    }

}
