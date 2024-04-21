package n1exercici1;

public class Main {
    public static void main(String[] args) {
        String directori = args[0];
        try{
            LlistarAlfaDirectori.llistarDir(directori);
        }catch(NoDirectoriException e){
            System.out.println(e.getMessage());
        }
    }
}