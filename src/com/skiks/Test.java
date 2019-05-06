package com.skiks;

import java.util.ArrayList;

public class Test {

    public static ArrayList<Integer> minimum (ArrayList<ArrayList<Integer>> result) {
        int min = result.get(0).size();
        int index = 0;
        for (int i = 1; i < result.size() ; i++) {
            if (result.get(i).size() < min) {
                min = result.get(i).size();
                index = i;
            }
        }
        return result.get(index);
    }
}
