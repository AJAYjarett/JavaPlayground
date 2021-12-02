package core.arrays;

public class ArrayExamples {
    private int[] numIntArr = new int[5];
    private int[] initArr = {1,2,3};


    public ArrayExamples(){
        this.numIntArr[0] = 1;
    }

    public void amendValue(int indexOfArr, int value){
        this.numIntArr[indexOfArr] = value;
    }


}
