package com.kbaidiuk;

public class Array {
    public static int getArrayFirstOccurIndex(int[] arr, int elem){
        int index = -1;
        if (arr != null) {
            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] == elem) index = elem;
            }

        }
        return index;

    }
    public static void main(String[] args) {
        int[] a = new int[] {1, -3, -8, 5, -6};
        int b = 6;
        System.out.println(getArrayFirstOccurIndex(a, b));


    }


}
