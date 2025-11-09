package arrays;

import linespace.lp;

public class TwoD {
    public static void main(String[] args) {
        /*int[][] TwoD = new int[10][10];
        TwoD[0][1] = 100;
        TwoD[1][0] = 200;

        System.out.println(Arrays.toString(TwoD));*/

        String[] veggies = {"onions", "carrots" , "beetroot"};
        String[] fruits = {"apple", "banana", "mangoes", "pomegranate", "grape"};
        String[] meat = {"chicken", "beef", "lamb", "fish"};

        String[][] groceries = {veggies, fruits, meat};

        /*for(String item: veggies) {
            System.out.println(item);
        }*/

        for (String[] category: groceries) {
            lp.one();
            for(String item: category) {
                System.out.print(item + " ");
            }
        }
        lp.one();

    }
}
