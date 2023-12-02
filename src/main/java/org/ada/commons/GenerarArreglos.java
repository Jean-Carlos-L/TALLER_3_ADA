package org.ada.commons;
import java.util.Random;
public class GenerarArreglos {
    public static int[] generarArreglo(int n) {
        int[] A = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            A[i] = random.nextInt(101); // Números aleatorios entre 0 y 100
        }
        return A;

    }
}
