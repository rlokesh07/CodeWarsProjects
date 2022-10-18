package com.company;

public class BraceChecker {

    public boolean isValid(String braces) {
        boolean valid = true;
        int openNormal = 0;
        int closedNormal = 0;
        int openStraight =0;
        int closedStraight = 0;
        int openCurly = 0;
        int closedCurly = 0;

        for (int i = 0; i < braces.length(); i++){

            if (braces.charAt(i) == '('){
                openNormal++;
            } else if(braces.charAt(i) == ')'){
                closedNormal++;
            } else if(braces.charAt(i) == '['){
                openStraight++;
            }else if(braces.charAt(i) == ']'){
                closedStraight++;
            } else if(braces.charAt(i)=='{'){
                openCurly++;
            } else if (braces.charAt(i)=='}'){
                closedCurly++;
            }

            if ((openNormal + openCurly + openStraight) < (closedNormal + closedCurly + closedStraight)){
                valid = false;
            }


        }
        // Add code here
        return valid;
    }

}