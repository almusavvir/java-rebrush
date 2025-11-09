package arrays;

import java.util.Arrays;

public class OneD {
    public static void main(String[] args) {
        int[] numarr = {65,34,69,75};
        System.out.println(Arrays.toString(numarr));

        int[] numarr2 = new int[25];

        numarr2[0] = 100;

        System.out.println(numarr2);

        System.out.println(System.identityHashCode(numarr));

        int[] numarr3 = new int[4];
        numarr3[0] = 11111;

        System.out.println(Arrays.toString(numarr3));
    }
}