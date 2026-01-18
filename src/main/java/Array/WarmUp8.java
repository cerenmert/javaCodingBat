package Array;

import BaseClass.BaseClass;

import java.util.Arrays;

/*
Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
makePi() → [3, 1, 4]
 */
public class WarmUp8 extends BaseClass {
    public static void main(String[] args) {
        int[] piArray = makePi();
        int[] expectedArray = {3, 1, 4};
        BaseClass.isTestPassed(Arrays.toString(piArray), Arrays.toString(expectedArray));
    }

    public static int[] makePi() {
        //return new int[] {3,1,4}; // sadece bu satırı da yazabilirdik
        int[] piDigits = new int[3];
        piDigits[0] = 3;
        piDigits[1] = 1;
        piDigits[2] = 4;
        System.out.println(Arrays.toString(piDigits));
        return piDigits;
    }

}
