package challenges.week_2.bubble_sort;

import java.util.Arrays;

public class BubbleSort {



    //Method to bubble-sort an array of ints
    public static int[] bubbleSort(int[] arr){
        boolean sorted = false;
        int iterationCounter = 0;

        //Temp int to facilitate swapping ints in the array around
        int tempInt;

        while (!sorted){
            iterationCounter++;
            //Count changes to identify when the array has been sorted.
            int countChanges = 0;

            for (int i = 0; i < arr.length-1; i++) {

                if(arr[i]>arr[i+1]){
                    tempInt = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tempInt;
                    countChanges++;
                }

            }
            if(countChanges==0) sorted = true;
        }
        System.out.println(iterationCounter);
        return arr;
    }
}
