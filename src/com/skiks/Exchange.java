package com.skiks;

import java.util.ArrayList;

public class Exchange {
        private int[] COINS_NOM = {2, 3, 5, 10};

        public Exchange()
        {
            //Nop
        }

        public Exchange(int[] coins) {
            COINS_NOM = coins;
        }


        public int getCountOfWays(int money, ArrayList arrayWithResults) {
            ArrayList<Integer> combinations = new ArrayList<>();
            int initialMoney = money;

            return getCountOfWays(money, COINS_NOM.length-1, arrayWithResults,
                    combinations, null, initialMoney);
        }

        private int getCountOfWays(int money, int indexOfCoin, ArrayList resultArray,
                                          ArrayList comb, Integer coinToPutInComb, int initialMoney) {

            if (coinToPutInComb != null) {
                int difference = initialMoney-money-coinToPutInComb;
                while (comb.size()>0 && sumArr(comb)>difference) {comb.remove(comb.size()-1);}
                comb.add(coinToPutInComb);
            }

            if (indexOfCoin == 0 && money % COINS_NOM[indexOfCoin] == 0) {
                ArrayList<Integer> addToRes = new ArrayList<>();
                for (Object o : comb) {addToRes.add((Integer) o);}
                for (int i = 0; i < money / COINS_NOM[indexOfCoin]; i++) {
                    addToRes.add(COINS_NOM[indexOfCoin]);
                }
                resultArray.add(addToRes);
                return 1;
            }

            if (money == 0) {
                ArrayList<Integer> addToRes = new ArrayList<>();
                for (Object o : comb) {addToRes.add((Integer) o);}
                resultArray.add(addToRes);
                return 1;
            }

            if (money < 0 || indexOfCoin <= 0) {return 0;}

            return getCountOfWays(money, indexOfCoin - 1, resultArray, comb, null, initialMoney)
                    + getCountOfWays(money - COINS_NOM[indexOfCoin], indexOfCoin, resultArray, comb, COINS_NOM[indexOfCoin], initialMoney);
        }

        private static int sumArr(ArrayList<Integer> arr){
            int sum = 0;
            for (Integer value: arr) {sum += value;}
            return sum;
        }
}
