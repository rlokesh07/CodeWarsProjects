package com.company;
/*
* */

public class Diamond {
    public static String print(int n) {
        String diamond = "";

        for (int i = 1; i < n; i++){
            int layer;
            if (i >= (n/2) ){
               layer = i - n/2;
            } else{
                layer = i;
            }

            diamond = diamond + "\n"+ layerCreator(n,layer);

        }



        return diamond;


    }

    public static String layerCreator(int width, int level){

        int spaces = Math.abs(width - level);

        String Layer = "";

       for (int i = 0; i < width; i++) {

           if (spaces / 2 > i | i > width - 1 - spaces / 2) {

               Layer = Layer + " ";
           } else {
               Layer = Layer + "*";
           }
       }
        return Layer;


    }
}
