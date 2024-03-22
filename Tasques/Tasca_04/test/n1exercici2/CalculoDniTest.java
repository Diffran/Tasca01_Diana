package n1exercici2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

public class CalculoDniTest {
    public static final List<Integer> numero = List.of(47964670,30151497,75135795,
            76243131,81250943,12680260,51854026,55607297,24420826,55915411);
    public static final List<Character> lletra = List.of('X','S','Q','V','Q','S','C','J','R','L');
    public static final HashMap<Integer, Character> dni = new HashMap<>();
    public static Stream<Integer> donarNumero(){
        return numero.stream();
    }

    public static HashMap<Integer,Character> inicializarDni(){

        for(int i=0; i<numero.size(); i++){
            dni.put(numero.get(i), lletra.get(i));
        }
        return dni;
    }
    @ParameterizedTest
    @MethodSource("donarNumero")
    public void calculDniTest(Integer numero){
        Assertions.assertEquals(inicializarDni().get(numero), CalculoDni.calculDni(numero));
    }

    //Arreglat
    @ParameterizedTest
    @ValueSource(ints = {47964670,30151497,75135795,
            76243131,81250943,12680260,51854026,55607297,24420826,55915411})
    public void calculDniTestValor(Integer numero){
        Assertions.assertEquals(inicializarDni().get(numero), CalculoDni.calculDni(numero));
    }
}
