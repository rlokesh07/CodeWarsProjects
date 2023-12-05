package com.company;

public class Range_Extraction {

    public static String rangeExtraction(int[] arr) {
        int length = arr.length;
        int previousNumber;
        boolean inRange = false;
        int rangeStart = -999999;
        int rangeEnd;
        String rangeExtraction = "";

        for (int i = 1; i < (length + 1); i++) {
            previousNumber = arr[i - 1];
            try {
                if (Math.abs(previousNumber - arr[i]) == 1) {
                    if (!inRange) {

                        rangeStart = previousNumber;
                        inRange = true;

                    }

                } else if (inRange) {


                    rangeEnd = previousNumber;

                    if (rangeEnd - rangeStart == 1) {
                        rangeExtraction = rangeExtraction.concat(rangeStart + "," + rangeEnd + ",");
                        inRange = false;
                    } else {
                        rangeExtraction = rangeExtraction.concat(rangeStart + "-" + rangeEnd + ",");
                    }

                    inRange = false;

                } else {

                    rangeExtraction = rangeExtraction.concat(previousNumber + ",");

                }
            } catch (Exception e) {


                if (Math.abs(arr[i - 2] - arr[i - 1]) == 1)

                {
                    rangeEnd = previousNumber;

                    if (rangeEnd - rangeStart == 1) {
                        rangeExtraction = rangeExtraction.concat(rangeStart + "," + rangeEnd);

                    } else {
                        rangeExtraction = rangeExtraction.concat(rangeStart + "-" + rangeEnd);
                    }

                    inRange = false;

                }
                else {

                    rangeExtraction = rangeExtraction.concat(Integer.toString(previousNumber));

                }


            }

        }
        return rangeExtraction;
    }
}