package capitulo_6;

public class Ponto {
    private Integer x;
    private Integer y;

    // construtor vazio
    public Ponto() {
        this.x = 0;
        this.y = 0;
    } 

    // construtor parametrizado 
    public Ponto(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }  

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }
    
    

}
