package n1excercici1;

import n1excercici1.botiga.Producte;
import n1excercici1.botiga.Venda;
import n1excercici1.botiga.VendaBuidaException;

public class Main {
    public static void main(String[] args) {

        Producte[] vendaBuida = new Producte[0];
        Producte[] vendaPlena = {
            new Producte("pa", 0.9f),
            new Producte("oli", 4.5f),
            new Producte("sal", 0.4f),
            new Producte("tomaquet", 1.3f)
        };

        try{
            Venda venda1 = new Venda(vendaBuida);
            System.out.println("VENDA 1 -> s'ha fet una venda de: " + venda1.getPreuTotal()+"€");
        }catch(VendaBuidaException e){
            System.out.println(e.getMessage());
        }

        try{
              Venda venda2 = new Venda(vendaPlena);
              System.out.println("VENDA2 -> s'ha fet una venda de:" + venda2.getPreuTotal());
              for(int i=0; i<=venda2.getProductes().length; i++){
                System.out.println(venda2.getProductes()[i].getNom());
              }
        }catch(ArrayIndexOutOfBoundsException e){
              System.out.println("ArrayIndexOutOfBoundsException: "+ e.getMessage());
        } catch(VendaBuidaException e){
            System.out.println(e.getMessage());
        }       
    }
}
