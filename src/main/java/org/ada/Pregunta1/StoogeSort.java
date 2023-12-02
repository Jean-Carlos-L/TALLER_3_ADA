package org.ada.Pregunta1;

public class StoogeSort {
    public void stoogeSort(int[] A, int i, int j) {
        // Si el elemento inicial es mayor que el final, se intercambian
        if (A[i] > A[j]) {
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }

        // Si hay más de dos elementos en el arreglo, se aplica la recursión
        if (i + 1 < j) {
            // Se calcula la tercera parte del tamaño del arreglo
            int k = (j - i + 1) / 3;

            // Se ordenan las primeras dos terceras partes
            stoogeSort(A, i, j - k);
            // Se ordenan las últimas dos terceras partes
            stoogeSort(A, i + k, j);
            // Se ordenan las primeras dos terceras partes de nuevo
            stoogeSort(A, i, j - k);
        }
    }
}
