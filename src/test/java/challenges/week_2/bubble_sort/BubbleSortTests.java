package challenges.week_2.bubble_sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BubbleSortTests {

    @Test
    public void bubbleSortTests(){
        int[] testArray1 = {1,2,3,4,5,6,7,8,9};
        int[] testArray2 = {1,8,12,15,28,32};
        int[] testingArray1 = {9,8,7,6,5,4,3,2,1};
        int[] testingArray2 = {8,28,15,32,12,1};
        Assertions.assertArrayEquals(BubbleSort.bubbleSort(testingArray1), testArray1);
        Assertions.assertArrayEquals(BubbleSort.bubbleSort(testingArray2), testArray2);
    }


}
