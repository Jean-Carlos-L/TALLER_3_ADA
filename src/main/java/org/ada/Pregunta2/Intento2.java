package org.ada.Pregunta2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Intento2 {
    public static List<Integer> quicksort(List<Integer> arr) {
        if (arr.size() <= 1) {
            return arr;
        } else {
            int pivot = arr.get(arr.size() / 2);
            List<Integer> left = new ArrayList<>();
            List<Integer> middle = new ArrayList<>();
            List<Integer> right = new ArrayList<>();
            for (int x : arr) {
                if (x < pivot) {
                    left.add(x);
                } else if (x == pivot) {
                    middle.add(x);
                } else {
                    right.add(x);
                }
            }

            List<Integer> result = new ArrayList<>();
            result.addAll(quicksort(left));
            result.addAll(middle);
            result.addAll(quicksort(right));

            return result;
        }
    }

    public static List<Integer> encontrarModa(List<Integer> arr) {
        // Ordenar el vector utilizando QuickSort
        List<Integer> arrSorted = quicksort(arr);

        // Inicializar variables para la moda
        List<Integer> moda = new ArrayList<>();
        int maxFrecuencia = 1;
        int frecuenciaActual = 1;

        // Encontrar la moda recorriendo el vector ordenado
        for (int i = 1; i < arrSorted.size(); i++) {
            if (arrSorted.get(i).equals(arrSorted.get(i - 1))) {
                frecuenciaActual++;
            } else {
                frecuenciaActual = 1;
            }

            if (frecuenciaActual > maxFrecuencia) {
                moda = new ArrayList<>();
                moda.add(arrSorted.get(i));
                maxFrecuencia = frecuenciaActual;
            } else if (frecuenciaActual == maxFrecuencia) {
                moda.add(arrSorted.get(i));
            }
        }
        return moda;
    }
}
