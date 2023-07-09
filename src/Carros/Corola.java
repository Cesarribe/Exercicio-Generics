package Carros;

class Corola extends Carro {

    public Corola (int ano, String modelo) {
        super(ano, modelo);
    }

    @Override
    public void carroLimpo() {
        System.out.println("Limpando o carro Corola: " + getAno() + " " + getModelo());
    }

    @Override
    public void documentacao() {
        System.out.println("Verificando a documentação do carro Corola: " + getAno() + " " + getModelo());
    }

    @Override
    public void garantia() {
        System.out.println("Garantia de Fabrica de 3 anos");
    }

    @Override
    public void vender() {

            garantia();
            documentacao();
            carroLimpo();
            System.out.println("Carro pronto para ser retirado");
        }
    }


