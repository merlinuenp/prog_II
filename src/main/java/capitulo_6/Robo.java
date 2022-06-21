package capitulo_6;


public class Robo { 
    private String nome;
    private Ponto ponto; 
    
    public Robo(){
        this.nome = ""; 
        this.ponto = new Ponto(); 
    }
    
    public Robo(String nome, Ponto ponto){ 
        this.nome = nome;
        this.ponto = ponto; 
    }

    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome; 
    }
    
    public Ponto getPonto(){
        return ponto; 
    }
    
    public void setPonto(Ponto ponto){
        this.ponto = ponto; 
    }
    
    public String mostrarPosicao(){
        return "X: " + ponto.getX() + " - " + "Y: " + ponto.getY(); 
    }
    
    
    public void andarDireita(){
        this.ponto.setX(ponto.getX() + 1);
    } 
    
    public void andarEsquerda(){
        this.ponto.setX(ponto.getX() - 1);
    }
    
    public void teletransportar(int x, int y){
        this.ponto.setX(x);
        this.ponto.setY(y);
    }
    
}

