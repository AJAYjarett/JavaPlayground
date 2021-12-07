package challenges.week_2.array_merger;

public abstract class SortingArrays {

    /*
    Methods to sort an array of ints
    Uses the BubbleSort style sorting seen in the BubbleSort Class
     */

    public int[] sortArrayAscending(int[] arrayToSort){
        boolean sorted = false;
        int tempInt;
        while (!sorted){
            int countChanges = 0;
            for (int i = 0; i < arrayToSort.length-1; i++) {
                if(arrayToSort[i]>arrayToSort[i+1]){
                    tempInt = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[i+1];
                    arrayToSort[i+1] = tempInt;
                    countChanges++;
                }
            }
            if(countChanges==0) sorted = true;
        }
        return arrayToSort;
    }

    public int[] sortArrayDescending(int[] arrayToSort){
        boolean sorted = false;
        int tempInt;
        while (!sorted){
            int countChanges = 0;
            for (int i = 0; i < arrayToSort.length-1; i++) {
                if(arrayToSort[i]<arrayToSort[i+1]){
                    tempInt = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[i+1];
                    arrayToSort[i+1] = tempInt;
                    countChanges++;
                }
            }
            if(countChanges==0) sorted = true;
        }
        return arrayToSort;
    }




}
