import org.ada.Pregunta2.QuickSortModa;
import org.ada.Pregunta2.ModaJava;
import org.ada.commons.GenerarArreglos;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestPregunta2 {
    @Test
    @DisplayName("PREGUNTA 2: Prueba de QuickSortModa para encontrar la moda de arreglos de tamanio n")
    public void testEncontrarModa() {

        QuickSortModa quickSortModa = new QuickSortModa();
        ModaJava modaJava = new ModaJava();
        for (int n : new int[]{10, 100, 1000, 10000}) {

            int[] A = GenerarArreglos.generarArreglo(n);
            List<Integer> numeros = new ArrayList<>(Arrays.asList(Arrays.stream(A).boxed().toArray(Integer[]::new)));

            var modaDivideYVenceras = quickSortModa.encontrarModa(numeros);
            var modaJavaList = modaJava.encontrarModas(A);

            assertTrue(modaDivideYVenceras.containsAll(modaJavaList));
        }
    }
}
