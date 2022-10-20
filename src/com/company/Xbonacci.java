package com.company;

public class Xbonacci {
    public static double[] xbonacci(double[] signature, int n){
        double[] answer = new double[n];
        for (int i = 0; i < n; i++){
            try {
                answer[i] = signature[i];

            } catch (Exception e){
                double count = 0;
               for (int w = (i - signature.length); w < n; w++){
                    count =  (answer[w] + count);
                }
               answer[i] = count;
            }
        }
        return answer;
    }
}
