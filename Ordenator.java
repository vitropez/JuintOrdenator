package com.lm2a.junit.seccionx;


public class Ordenator {

    public static int[] ordenar(int[] arr){

        for (int i = 0; i < arr.length; i++)
        {
            int idx = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[idx]) {
                    idx = j;
                }
            }

            int numeroChico = arr[idx];

            arr[idx] = arr[i];
            arr[i] = numeroChico;
        }

        return arr;
    }
}