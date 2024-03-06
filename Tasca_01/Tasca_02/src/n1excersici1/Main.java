package n1excersici1;

import n1excersici1.botiga.Producte;
import n1excersici1.botiga.Venda;
import n1excersici1.botiga.VendaBuidaException;

public class Main {
    public static void main(String[] args) {
        //array buit
        Producte[] vendaBuida = new Producte[0];
        //array ple
        Producte[] vendaPlena = {
            new Producte("pa", 0.9f),
            new Producte("oli", 4.5f),
            new Producte("sal", 0.4f),
            new Producte("tomaquet", 1.3f)
        };
        //crear objecte venda
        try{
            if(vendaBuida.length==0){
                throw new VendaBuidaException("Per fer una venda primer has d’afegir productes");  
            }else{
                Venda venda1 = new Venda(vendaBuida);
                System.out.println("s'ha fet una venda de: " + venda1.getPreuTotal());
            }
        }catch(VendaBuidaException e){
            System.out.println(e.getMessage());
        }
        //crear objecte venda 2
        try{
            if(vendaPlena.length==0){
                throw new VendaBuidaException("Per fer una venda primer has d’afegir productes");  
            }else{
              Venda venda2 = new Venda(vendaPlena);
              System.out.println("s'ha fet una venda de:" + venda2.getPreuTotal());
              //mostra la captura d'una excepció tipus ArrayIndexOutOfBoundsException
              //iterant l'objecte venda2 que hem creat
              try{
                for(int i=0; i<=venda2.getProductes().length; i++){
                    System.out.println(venda2.getProductes()[i].getNom());
                  }
              }catch(ArrayIndexOutOfBoundsException e){
                  System.out.println("ArrayIndexOutOfBoundsException: "+ e.getMessage());
              }
            }
        }catch(VendaBuidaException e){
            System.out.println(e.getMessage());
        }       
    }
}
