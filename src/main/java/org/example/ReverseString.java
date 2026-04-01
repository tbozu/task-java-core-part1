package org.example;

public class ReverseString {

    public static String reversedStringWithStringBuffer(String initalString){
        StringBuffer stringBuffer = new StringBuffer(initalString);
        return stringBuffer.reverse().toString();
    }
    public static String reversedStringWithStringBuilder(String initialStringForBuilder){
        StringBuilder stringBuilder = new StringBuilder(initialStringForBuilder);
        return stringBuilder.reverse().toString();
    }
    public static String reversedString(String initialStringForSecondMethod){

        String changedString = "";

        for(int i = initialStringForSecondMethod.length()-1;i>=0;i--){
            changedString+=initialStringForSecondMethod.charAt(i);
        }

        return changedString;
    }
    public static String reversedStringWithPoiners(String initialStringWithPointers){
        char[] arrayInitialString = initialStringWithPointers.toCharArray();

        int firstElement = 0;
        int lastElement = initialStringWithPointers.length()-1;
        while (firstElement < lastElement){

            char temp = arrayInitialString[firstElement];
            arrayInitialString[firstElement] = arrayInitialString[lastElement];
            arrayInitialString[lastElement] = temp;
            firstElement++;
            lastElement--;
        }

        return new String(arrayInitialString);
    }
}


