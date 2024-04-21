package n2exercici2.pack;

public class LlistaIndefinidaArguments {
    public static <T> void metodeLlistaGen(T...args){
        //parametre T...args -> permet entrar qualsevol numero de parametres de tipus generic
        for(T param : args){//forEach
            System.out.println(param);
        }
    }
}
