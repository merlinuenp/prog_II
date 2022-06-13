package capitulo_4;

public class Robo {
    String nome;
    Integer x;
    Integer y;

    public Robo() {
        this.nome = "";
        this.x = 0;
        this.y = 0;
    }
    
    Robo(String nome, Integer x, Integer y) {
        this.nome = nome;
        this.x = x;
        this.y = y;
    }
    
    void andarDireita(){
        this.x++;
    }
    
    void andarEsquerda(){
        this.x--;
    }
    
    void andarCima(){
        this.y++;
    }
    
    void andarBaixo(){
        this.y--;
    }

    void teletransportar(Integer x, Integer y){
        this.x = x;
        this.y = y; 
    }
    
    String informarPosicao(){
        return ("x: " + x + " y: " + y); 
    }
}
