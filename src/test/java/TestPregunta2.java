import org.ada.Pregunta2.EncontrarModa;
import org.ada.commons.GenerarArreglos;
import org.apache.commons.math3.stat.Frequency;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestPregunta2 {
    @Test
    // Se genera un arreglo aleatorio de tamaño n
    public void EncontrarModa(){
        EncontrarModa encontrarModa= new EncontrarModa();
        for (int n : new int[]{10, 100, 1000}) {


            // Se genera un arreglo aleatorio de tamaño n
            int[] A = GenerarArreglos.generarArreglo(n);

            // Se mide el tiempo inicial
            long inicio = System.currentTimeMillis();

            // Se aplica el algoritmo para encontrar la moda
            int[] moda = encontrarModa.encontrarModa(A, 0, n - 1);


            assertEquals(moda[0], moda[0]);
            // Se mide el tiempo final
            long fin = System.currentTimeMillis();

            // Se calcula el tiempo transcurrido
            double tiempo = (fin - inicio) / 1000.0; // Convertir a segundos

            // Se imprime el resultado
            System.out.printf("El tiempo de ejecución para n = %d fue de %.6f segundos%n", n, tiempo);
            System.out.printf("La moda es %s y se repite veces%n", Arrays.toString(moda));
        }


        // Contar la frecuencia de cada elemento en el arreglo


        // Encontrar el modo

    }
}
