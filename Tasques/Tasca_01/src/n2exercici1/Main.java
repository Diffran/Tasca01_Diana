package n2exercici1;

import n2exercici1.utils.Smartphone;

public class Main {
    public static void main(String[] args) {
        Smartphone mòbil = new Smartphone("Xiaomi", "Mi2");
        mòbil.fotografiar();
        mòbil.alarma();
        mòbil.trucar("636495612");
    }
}
