package core.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static  org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayExamplesTests {

    ArrayExamples arrayExamples = new ArrayExamples();

    /*
    This test is obsolete as the method it is testing is bad and shouldn't be used
    See method for further details.

     */

    @Test
    public void modInitArrTest(){
        int[] newMenu = {2,5,1,3,4};
        arrayExamples.modInitArr(newMenu);
        assertEquals(newMenu, arrayExamples.getInitArr());

    }

}
