package com.company;

import com.company.UniqueNumbers;
import com.company.ValidParentheses;
import com.company.Diamond;
import com.company.toCamelCase;
import com.company.Xbonacci;
public class Main {

    public static void main(String[] args) {

        double[] thing = new double[2];
        thing[0] = 0;
        thing[1] = 1;

        double[] key = new double[10];

        key = Xbonacci.xbonacci(thing, 10);
        for (int i = 0; i < 10; i++){




            System.out.println(key[i]);
        }



    }
}
