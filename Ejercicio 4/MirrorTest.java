package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MirrorTest {

    @Test
    void testMirrorEnds() {
        Mirror m = new Mirror();

        // Caso con coincidencia parcial
        Assertions.assertEquals("ab", m.mirrorEnds("abXYZba"));

        // Caso donde toda la cadena es un espejo (palíndromo)
        Assertions.assertEquals("aba", m.mirrorEnds("aba"));

        // Caso con una sola coincidencia
        Assertions.assertEquals("a", m.mirrorEnds("abca"));

        // Caso sin coincidencias
        Assertions.assertEquals("", m.mirrorEnds("xyz"));
        
        // Caso cadena vacía
        Assertions.assertEquals("", m.mirrorEnds(""));
    }
}