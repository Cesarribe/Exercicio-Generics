package Carros;

import Carros.Carro;
import Carros.Corola;

public class Main {
    public static void main(String[] args) {
        CarrosVendidos carrosVendidos = new CarrosVendidos();

        Carro corola = new Corola(2023, "XlT");
        carrosVendidos.vender(corola);
        Carro hb20 = new HB20(2023,"Ltz");
        carrosVendidos.vender(hb20);
        System.out.println("");

        carrosVendidos.listarCarrosVendidos();

    }
}