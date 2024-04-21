package n1exercici1;

public class NoDirectoriException extends Exception{
    public NoDirectoriException(){
        super("El File no és un directori");
    }
}
