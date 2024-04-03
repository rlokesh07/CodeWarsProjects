package com.company;

public class DNAComplements {

    public static String makeComplement(String dna) {

        //we are using the StingBuilder Object to make it easier to add the characters to the string
        StringBuilder complementString = new StringBuilder();


        //Create a loop that repeats for every letter in the DNA string
        for (int i = 0; i < dna.length(); i++){

            //passes though the character at the current index of the dna string though the complement method we created bellow. We are then adding it to the end of our string(Append)
            complementString.append(complement(dna.charAt(i)));


        }

        return complementString.toString();
    }

    //Creating a private function (something that can only bee seen within this class) that will return to complement of the character I input (currentCharacter)
    private static char complement(char currentCharacter){
        //if the letter at index i is uppercase, this value will be true
        boolean isUppercase = Character.isUpperCase(currentCharacter);

        //setting all characters as lowercase to make it easier
         currentCharacter = Character.toLowerCase(currentCharacter);
         char newCharacter;

         //compare the current character against the possible types and set the character newCharacter as the complement
        if (currentCharacter == 'a') {
            newCharacter = 't';
        } else if (currentCharacter == 't'){
            newCharacter = 'a';
        } else if (currentCharacter == 'g'){
            newCharacter = 'c';
        } else if (currentCharacter == 'c') {
            newCharacter = 'g';

        } else {
            //if it is none of these, that means that it does not have a complement, so just pass though the current character
            newCharacter = currentCharacter;
        }

        //if the character was uppercase, then change the case back before returning the value
        return isUppercase ? Character.toUpperCase(newCharacter) : newCharacter;

    }
}
