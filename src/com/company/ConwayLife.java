package com.company;

public class ConwayLife {

    public static int[][] getGeneration(int[][] cells, int generations) {
        // your code goes here
        int[][] lastGeneration = cells;
        for (int i = 0;i < generations; i++){
        int[][] currentGeneration = new int[lastGeneration[0].length][lastGeneration.length];

        for (int y = 0; y < currentGeneration.length; y++){
            for (int x = 0; x < currentGeneration[0].length; x++){
                int neighbors = 0;
                try {
                    if (lastGeneration[y+1][x] == 1){
                        neighbors++;
                    }
                } catch (Exception e){

                }
                try {
                    if (lastGeneration[y+1][x+1] == 1){
                        neighbors++;
                    }
                } catch (Exception e){

                }
                try {
                    if (lastGeneration[y+1][x-1] == 1){
                        neighbors++;
                    }
                } catch (Exception e){

                }
                try {
                    if (lastGeneration[y][x+1] == 1){
                        neighbors++;
                    }
                } catch (Exception e){

                }
                try {
                    if (lastGeneration[y][x-1] == 1){
                        neighbors++;
                    }
                } catch (Exception e){

                }
                try {
                    if (lastGeneration[y-1][x+1] == 1){
                        neighbors++;
                    }
                } catch (Exception e){

                }
                try {
                    if (lastGeneration[y-1][x-1] == 1){
                        neighbors++;
                    }
                } catch (Exception e){

                }
                try {
                    if (lastGeneration[y-1][x] == 1){
                        neighbors++;
                    }
                } catch (Exception e){

                }


                if (neighbors == 3|| neighbors == 2){

                    currentGeneration[y][x] = 1;
                } else {
                    currentGeneration[y][x] = 0;
                }
            }
            lastGeneration = currentGeneration;
        }
        }

        return lastGeneration;
    }

}