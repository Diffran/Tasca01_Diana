package n1exercici2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import java.util.List;
import java.util.stream.Stream;

public class CalculoDniTest {
    public static final  List dni = List.of(47964670,30151497,75135795,
            76243131,81250943,12680260,51854026,55607297,24420826,55915411);
    public static final Stream<Character> lletra = Stream.of('X','S','Q','V','Q','S','C','J','R','L');
    public static Stream<Integer> donarDni(){
        return dni.stream();
    }
    @ParameterizedTest
    @MethodSource("donarDni")
    public void calculDniTest(Integer dni){
        Assertions.assertEquals(lletra,CalculoDni.calculDni(dni));
    }
}
