package com.company;

public class UniqueNumbers {
    public static double findUniq(double arr[]) {
        double firstNum = arr[0];
        boolean firstNumberIsTrue =false;
        double outlier = 0;
        for (int i = 1; i < arr.length; i++){
            if (arr[i] == firstNum){
                firstNumberIsTrue = true;
            }
        }

        if (firstNumberIsTrue){
            for (int i = 0; i < arr.length; i++){
                if (arr[i] != firstNum){
                    outlier = arr[i];
                }
            }
        } else{
            outlier = firstNum;
        }
        return outlier;

        }


}
