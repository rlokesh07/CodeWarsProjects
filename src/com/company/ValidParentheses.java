package com.company;

public class ValidParentheses {
    public static boolean validParentheses(String parens)
    {
        boolean valid = true;
        int numberOfOpening = 0;
        int numberOfClosing = 0;
        for (int i = 0; i < parens.length(); i++){

            if (parens.charAt(i) == '('){
                numberOfOpening = numberOfOpening + 1;
            } else if (parens.charAt(i) == ')'){

                numberOfClosing = numberOfClosing + 1;
                if (numberOfClosing > numberOfOpening){
                    valid = false;
                }


            }

        }

        if (numberOfClosing != numberOfOpening){
            valid = false;
        }

        return valid;
    }

}
