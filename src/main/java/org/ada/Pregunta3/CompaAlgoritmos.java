package org.ada.Pregunta3;

public class CompaAlgoritmos {

    // Función para implementar el algoritmo QuickSort
    public void quicksort(int[] A, int i, int j) {
        // Si el arreglo tiene un solo elemento, ya está ordenado
        if (i >= j) {
            return;
        }

        // Se elige el último elemento como pivote
        int pivote = A[j];
        // Se inicializa el índice de partición
        int k = i;
        // Se recorre el arreglo desde el inicio hasta el penúltimo elemento
        for (int l = i; l < j; l++) {
            // Si el elemento actual es menor o igual que el pivote, se intercambia con el elemento en el índice de partición
            if (A[l] <= pivote) {
                int temp = A[l];
                A[l] = A[k];
                A[k] = temp;
                // Se incrementa el índice de partición
                k++;
            }
        }
        // Se coloca el pivote en el índice de partición
        int temp = A[j];
        A[j] = A[k];
        A[k] = temp;
        // Se ordena recursivamente la sublista izquierda y la sublista derecha
        quicksort(A, i, k - 1);
        quicksort(A, k + 1, j);
    }

    // Función para implementar el algoritmo Insertion-Sort
    public void insertionSort(int[] A, int n) {
        // Se recorre el arreglo desde el segundo elemento hasta el último
        for (int i = 1; i < n; i++) {
            // Se guarda el elemento actual como clave
            int clave = A[i];
            // Se inicializa el índice del elemento anterior
            int j = i - 1;
            // Se compara la clave con los elementos anteriores y se mueven los mayores a la derecha
            while (j >= 0 && A[j] > clave) {
                A[j + 1] = A[j];
                j--;
            }
            // Se inserta la clave en su posición correcta
            A[j + 1] = clave;
        }
    }

    // Función para implementar el algoritmo Merge-Sort
    public void mergeSort(int[] A, int i, int j) {
        // Si el arreglo tiene un solo elemento, ya está ordenado
        if (i < j) {
            // Se calcula el punto medio del arreglo
            int m = (i + j) / 2;
            // Se ordena recursivamente la sublista izquierda y la sublista derecha
            mergeSort(A, i, m);
            mergeSort(A, m + 1, j);
            // Se mezclan las sublistas ordenadas
            merge(A, i, m, j);
        }
    }

    // Función auxiliar para mezclar dos sublistas ordenadas
    public void merge(int[] A, int i, int m, int j) {
        // Se crea una lista auxiliar para almacenar el resultado
        int[] B = new int[j - i + 1];
        // Se inicializan los índices de las sublistas
        int k = i;
        int l = m + 1;
        int idx = 0;
        // Se comparan los elementos de las sublistas y se agregan al resultado en orden
        while (k <= m && l <= j) {
            if (A[k] <= A[l]) {
                B[idx++] = A[k++];
            } else {
                B[idx++] = A[l++];
            }
        }
        // Se agregan los elementos restantes de la sublista izquierda, si hay
        while (k <= m) {
            B[idx++] = A[k++];
        }
        // Se agregan los elementos restantes de la sublista derecha, si hay
        while (l <= j) {
            B[idx++] = A[l++];
        }
        // Se copia el resultado en el arreglo original
        System.arraycopy(B, 0, A, i, B.length);
    }
}
