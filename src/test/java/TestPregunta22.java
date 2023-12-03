import org.ada.Pregunta2.Intento2;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestPregunta22 {
    @Test
    public void testEncontrarModa() {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(3);
        numeros.add(1);
        numeros.add(3);
        numeros.add(6);
        numeros.add(1);
        numeros.add(5);
        numeros.add(7);
        numeros.add(4);
        numeros.add(10);
        numeros.add(12);

        Intento2 intento2 = new Intento2();
        var moda = intento2.encontrarModa(numeros);

        System.out.println(moda);

//        assertArrayEquals(modaEsperada, modaResultado);
    }
}
