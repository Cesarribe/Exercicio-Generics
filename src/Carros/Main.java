package Carros;

import Carros.Carro;
import Carros.Corola;

public class Main {
    public static void main(String[] args) {

        Carro corola = new Corola(2023, "XlT");
        Carro hb20 = new HB20(2023,"Ltz");
        hb20.vender();
        System.out.println("");
        corola.vender();
    }
}