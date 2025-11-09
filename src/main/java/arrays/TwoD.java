package arrays;

import java.util.Arrays;

public class TwoD {
    public static void main(String[] args) {
        int[][] TwoD = new int[10][10];
        TwoD[0][1] = 100;
        TwoD[1][0] = 200;

        System.out.println(Arrays.toString(TwoD));
    }
}
