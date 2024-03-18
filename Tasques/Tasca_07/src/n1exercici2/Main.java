package n1exercici2;

import n1exercici2.pack.TreballadorOnline;

public class Main {
    public static void main(String[] args) {
        //L'EXERCICI ESTA EN LA CLASSE TREBALLADOR ONLINE
        TreballadorOnline.metodeNoObsolet();
        TreballadorOnline.metodeObsolet();//té warning
        TreballadorOnline.utiizarMetodeObsolet();//no té warning
    }
}
