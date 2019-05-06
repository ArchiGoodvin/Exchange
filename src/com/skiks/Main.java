package com.skiks;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Exchange exchange = new Exchange();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        int variants = exchange.getCountOfWays(27, result);
        for (ArrayList arr: result){
            System.out.println(arr);
        }
        System.out.println("Загалом - "+ variants);


    }
}
