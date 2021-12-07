package challenges.week_2.array_merger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayMergerTests {


    ArrayMerger arrayMerger = new ArrayMerger();
    int[] array1 = {1,2,3,4};
    int[] array2 = {3,4,5,6};

    @Test
    public void arrayMergerTests(){
        int[] testingArrayMerger = {1,2,3,4,3,4,5,6};
        Assertions.assertArrayEquals(arrayMerger.mergeArrays(array1,array2), testingArrayMerger);
    }

    @Test
    public void arrayMergerAscendingTests(){
        int[] testingAscendingArrayMerger = {1,2,3,3,4,4,5,6};
        Assertions.assertArrayEquals(arrayMerger.mergeArraysAscending(array1,array2),testingAscendingArrayMerger);
    }

    @Test
    public void arrayMergerDescendingTests(){
        int[] testingDescendingArrayMerger = {6,5,4,4,3,3,2,1};
        Assertions.assertArrayEquals(arrayMerger.mergeArraysDescending(array1,array2),testingDescendingArrayMerger);
    }
}
