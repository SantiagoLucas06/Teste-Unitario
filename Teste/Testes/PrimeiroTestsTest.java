package Testes;

import org.junit.Assert;
import org.junit.Test;

public class PrimeiroTestsTest {

    @Test
    public void primeiroTest() {
        char[] nome = {'L', 'u', 'c', 'a', 's'};

        char[] nome1 = {'L', 'u', 'c', 'a', 's'};
        Assert.assertArrayEquals(nome, nome1);
        System.out.println("Passou no teste");
    }
    @Test
    public void testeNotEquals() {
        char[] nome = {'L', 'u', 'c','a','s'};

        char[] nome1 = {'L', 'u', 'c','a','s'};
        Assert.assertArrayEquals(nome,nome1);
        System.out.println("Passou no teste");
    }
}