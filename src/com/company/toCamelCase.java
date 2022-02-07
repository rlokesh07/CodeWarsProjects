package com.company;

public class toCamelCase {
    public static String[] solution(String s) {
        //Write your code here
        int length;
        if (ifOdd(s.length())){
            length = (s.length()+2);
        } else {
            length = (s.length()+1);
        }
        String[] solution = new String[length];
        for (int i = 0; i < length/2; i = i + 2){
            try {
                solution[i/2] = new StringBuilder().append(s.charAt(i)).append(s.charAt((i)+1)).toString();
            } catch (Exception e){
                solution[i/2] = new StringBuilder().append(s.charAt(i)).append('_').toString();
            }

        }
        return solution;
    }

    public static boolean ifOdd(int Length){
        if (Length % 2 > 1){
            return false;
        }
        else {
            return true;
        }
    }
}
