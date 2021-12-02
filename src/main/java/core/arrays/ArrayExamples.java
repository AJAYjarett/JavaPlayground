package core.arrays;

public class ArrayExamples {

    private int[] initArr = {1,2,3,4,5};

    public ArrayExamples() {
    }

    public int[] getInitArr() {
        return initArr;
    }

    /*
    this method is bad
    it should be split into multiple ones
    first to clear the new menu array to find if is appropriate
    second to actually implement the new array
    a better way to do this would be to only allow the user to move 1 menu item at a time.
     */
    public int[] modInitArr(int[] newArr) {
        if (newArr.length == 5){
            int count = 0;
            for (int i = 0; i<5; i++){
                if (0<i && i<=5){
                    for (int j = 0; j<5; j++){
                        if (newArr[i] == newArr[j]) count++;
                    }
                }
            }
            if (count == 5) this.initArr = newArr;
        }
        return this.initArr;
    }
}
