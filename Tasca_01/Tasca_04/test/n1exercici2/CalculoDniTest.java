package n1exercici2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

public class CalculoDniTest {
    public static final  Stream<Integer> dni = Stream.of(47964670,30151497,75135795,
            76243131,81250943,12680260,51854026,55607297,24420826,55915411);

    @ParameterizedTest
    @MethodSource()
    public static void calculDniTest(){

    }

}
