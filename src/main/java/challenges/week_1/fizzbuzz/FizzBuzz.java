package challenges.week_1.fizzbuzz;



public class FizzBuzz {

    /*
    Print integers 1 to N, but print “Fizz” if an integer is divisible by 3,
    “Buzz” if an integer is divisible by 5, and “FizzBuzz” if an integer is divisible by both 3 and 5.

    Plan:
    - print integers 1 to /n
    -- manage a range
    - divisibleBy
    - Array / Arraylist - Strings - manage an integer into a string
    - output the outcome

     */

    //Array to manipulate
    private String[] fizzBuzzArr;

    public FizzBuzz(int upperBound) {

        //Create String array using the upper bound
        this.fizzBuzzArr = new String[upperBound];

        //for loop to populate fizzBuzzArr
        for (int i = 0; i < fizzBuzzArr.length; i++) {
            fizzBuzzArr[i] = String.valueOf(i+1);
        }

        //for loop to change num in array to fizz or buzz or fizzbuzz if appropriate
        for (int i = 0; i < fizzBuzzArr.length; i++) {

            //line to use new method to manipulate arr
            changeArr(determineDivisible(Integer.parseInt(fizzBuzzArr[i])), i);

        }
    }

    //Creating method to deal with changing the array
    public void changeArr(int divisibleOption, int index){
        if (divisibleOption == 1) this.fizzBuzzArr[index] = "FizzBuzz";
        if (divisibleOption == 2) this.fizzBuzzArr[index] = "Fizz";
        if (divisibleOption == 3) this.fizzBuzzArr[index] = "Buzz";

    }

    //Method to decide which number the passed int is divisible by out of 3 or 5 or both
    public int determineDivisible(int numToDivide){
        if (numToDivide%3==0 && numToDivide%5==0) return 1;
        if (numToDivide%3==0) return 2;
        if (numToDivide%5==0) return 3;
        return 0;
    }

    public String getFizzBuzzArrIndex(int index) {
        return fizzBuzzArr[index];
    }
}
