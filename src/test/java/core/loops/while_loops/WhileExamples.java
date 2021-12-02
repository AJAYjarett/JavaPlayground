package core.loops.while_loops;

public class WhileExamples {

    public void printNum(int printUpTo){
        int count = printUpTo;
        while (count != 0) {
            System.out.println(count);
            count--;
        }
    }

    // the difference is Do while will always run once
    public void doWhile(int printUpTo){
        int count = printUpTo;

        do {
            System.out.println(count);
            count--;
        } while (count != 0);
    }



}
