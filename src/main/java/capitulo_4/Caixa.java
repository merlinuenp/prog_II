package capitulo_4;

public class Caixa {
    int largura;
    int altura;
    int comprimento;

    public Caixa() {
        this.largura = 0;
        this.altura = 0;
        this.comprimento = 0;
    }

    public Caixa(int largura, int altura, int comprimento) {
        this.largura = largura;
        this.altura = altura;
        this.comprimento = comprimento;
    }
    
    public Caixa(int medida) {
        this.largura = medida;
        this.altura = medida;
        this.comprimento = medida;
    }
    
    int calcularVolume(){
        return largura * altura * comprimento; 
    }

}
