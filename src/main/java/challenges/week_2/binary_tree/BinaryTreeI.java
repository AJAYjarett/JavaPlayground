package challenges.week_2.binary_tree;

public interface BinaryTreeI {
    int getRootElement();

    int getNumberOfElements();

    void addElement(int element);

    void addElements(final int[] elements);

    boolean findElement(int value);

    int[] getSortedTreeAsc();

    int[] getSortedTreeDesc();

}
