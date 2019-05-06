package com.skiks;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] coins = {20, 50, 100, 200};
        Exchange exchange = new Exchange(coins);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        int variants = exchange.getCountOfWays(780, result);
        for (ArrayList arr: result){
            System.out.println(arr);
        }
        System.out.println("Загалом - "+ variants);
        ArrayList<Integer> test = Test.minimum(result);
        System.out.println("Найменший - " + test + ", "+ test.size() + " елементів.");


    }
}
