package org.example;

public class ArrayAscending {

    public static boolean checkArrayIfAscending(int sizeArray,int[] arrayCheck){

        int[] arrayTemp = new int[sizeArray];
        boolean isAscending = true;
        //copy old array in new array
        for (int i = 0; i<=arrayTemp.length-1;i++){
            arrayTemp[i] = arrayCheck[i];
        }
        for (int i = 0; i<arrayTemp.length-1;i++){
            if (arrayTemp[i] >= arrayTemp[i+1]) {
                isAscending = false;
            }

        }
        return isAscending;
    }
}
