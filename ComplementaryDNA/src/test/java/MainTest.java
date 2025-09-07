import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MainTest {

    @Test
    public void test01() {
        assertEquals("TTTT", Main.makeComplement("AAAA"));
    }
    @Test
    public void test02() {
        assertEquals("TAACG", Main.makeComplement("ATTGC"));
    }
    @Test
    public void test03() {
        assertEquals("CATA", Main.makeComplement("GTAT"));
    }
}