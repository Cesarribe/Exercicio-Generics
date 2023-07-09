package Carros;

abstract class Carro {
    private int ano;
    private String modelo;

    public Carro(int ano, String modelo) {
        this.ano = ano;
        this.modelo = modelo;
    }

    public abstract void carroLimpo();

    public abstract void documentacao();

    public abstract void garantia();

    public void vender() {
        garantia();
        documentacao();
        carroLimpo();
        System.out.println("Carro vendido");
    }

    public int getAno() {
        return ano;
    }

    public String getModelo() {
        return modelo;
    }
}
