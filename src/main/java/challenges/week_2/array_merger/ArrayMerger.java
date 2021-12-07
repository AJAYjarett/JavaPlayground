package challenges.week_2.array_merger;

public class ArrayMerger extends SortingArrays{

    public ArrayMerger() {

    }

    //Method to merge 2 arrays of ints into 1 larger array of ints
    public int[] mergeArrays(int[] array1, int[] array2){
        int[] mergedArray = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            mergedArray[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            mergedArray[i+array1.length] = array2[i];
        }
        return mergedArray;
    }

    //method to merge 2 arrays and then sort them in Ascending order
    public int[] mergeArraysAscending(int[] array1, int[] array2){
        int[] arrayToSort = mergeArrays(array1, array2);
        int[] sortedArray = sortArrayAscending(arrayToSort);
        return sortedArray;
    }

    //Method to merge 2 arrays and then sort them in Descending order
    public int[] mergeArraysDescending(int[] array1, int[] array2){
        int[] arrayToSort = mergeArrays(array1, array2);
        int[] sortedArray = sortArrayDescending(arrayToSort);
        return sortedArray;
    }



}
