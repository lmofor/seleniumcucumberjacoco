package utilitaires;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculsTest {

    @Test
    public void somme() {
        assertEquals(9, Calculs.somme(4,5));
    }

    @Test
    public void produit() {
        assertEquals(20, Calculs.produit(4,5));
    }

    @Test
    public void calcul() {
        assertNotNull(new Calculs());
    }
}