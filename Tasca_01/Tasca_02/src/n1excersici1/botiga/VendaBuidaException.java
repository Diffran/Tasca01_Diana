package n1excersici1.botiga;

public class VendaBuidaException extends Exception{
    private final String message ="Per fer una venda primer has d’afegir productes";
    public VendaBuidaException(){
        getMessage();
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
