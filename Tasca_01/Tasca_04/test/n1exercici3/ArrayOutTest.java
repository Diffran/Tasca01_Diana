package n1exercici3;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import static n1exercici3.ArrayOut.arrayPocho;

public class ArrayOutTest {
    @Test
    public void arrayPochoTest(){
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> {
                    arrayPocho();
                });
    }
}
