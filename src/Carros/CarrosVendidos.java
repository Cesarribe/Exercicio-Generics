package Carros;

import Carros.Carro;

import java.util.ArrayList;
import java.util.List;

class CarrosVendidos {
    private List<Carro> carrosVendidos;

    public CarrosVendidos() {
        carrosVendidos = new ArrayList<>();
    }

    public void vender(Carro carro) {

        carro.documentacao();
        carro.garantia();
        carro.carroLimpo();
        carrosVendidos.add(carro);
        System.out.println("Carro vendido: " + carro.getModelo() + " " + carro.getAno());
    }

    public void listarCarrosVendidos() {
        System.out.println("Carros Vendidos:");
        for (Carro carro : carrosVendidos) {
            System.out.println(carro.getClass() + " " + carro.getAno());
        }
    }
}
