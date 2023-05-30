package com.company;

public class ROT13 {

        public static String rot13(String message) {


            StringBuilder ROT13 = new StringBuilder();

            String alphabetlower = "abcdefghijklmnopqrstuvwxyz";

            String alphabetupper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

            String inverselower = "nopqrstuvwxyzabcdefghijklm";

            String inverseupper = "NOPQRSTUVWXYZABCDEFGHIJKLM";

            for (int i = 0; i < message.length(); i++){
                char currentCharacter = message.charAt(i);

                if (Character.isUpperCase(currentCharacter)){
                    try {
                        ROT13.append(inverseupper.charAt(alphabetupper.indexOf(currentCharacter)));
                    } catch (Exception e){
                        ROT13.append(currentCharacter);
                    }
                } else if (!Character.isAlphabetic(currentCharacter)){
                    ROT13.append(currentCharacter);
                } else {
                    try {
                        ROT13.append(inverselower.charAt(alphabetlower.indexOf(currentCharacter)));
                    } catch (Exception e){
                        ROT13.append(currentCharacter);
                    }


                }
            }
            return ROT13.toString();
        }



}


