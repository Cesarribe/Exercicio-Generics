package Carros;

class HB20 extends Carro {
    public HB20(int ano, String modelo) {
        super(ano, modelo);
    }

    @Override
    public void carroLimpo() {
        System.out.println("Limpando o carro HB20: " + getAno() + " " + getModelo());
    }

    @Override
    public void documentacao() {
        System.out.println("Verificando a documentação do carro HB20: " + getAno() + " " + getModelo());
    }

    @Override
    public void garantia() {
        System.out.println("Garantia de fabrica de 5 anos");
    }

    @Override
    public void vender() {
    garantia();
    documentacao();
    carroLimpo();
        System.out.println("Carro pronto para ser retirado");
    }

}