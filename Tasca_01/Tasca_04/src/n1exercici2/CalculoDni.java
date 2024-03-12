package n1exercici2;

public class CalculoDni {
      static List<Character> letra = List.of('T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'));
 
    public static char calculDni(int dni){
        int index;
        index = dni%23;
        return letra.get(index);
    }
}
