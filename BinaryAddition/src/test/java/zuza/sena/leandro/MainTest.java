package zuza.sena.leandro;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static zuza.sena.leandro.Main.binaryAddition;

class MainTest {

    @Test
    void binaryAdditionTest() {
        Assertions.assertEquals("1", binaryAddition(0,1));
        Assertions.assertEquals("0", binaryAddition(0,0));
        Assertions.assertEquals("10", binaryAddition(1,1));
        Assertions.assertEquals("11", binaryAddition(2,1));
        Assertions.assertEquals("11001", binaryAddition(24,1));
    }
}