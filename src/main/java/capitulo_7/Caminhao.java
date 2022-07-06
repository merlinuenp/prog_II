package capitulo_7;

// Caminhao herda de (é um) Veiculo

import java.time.LocalDate;

public class Caminhao extends Veiculo {
    private Integer capacidadeCarga; 
    
    public Caminhao(){
        super();
        this.capacidadeCarga = 0; 
    }

    public Caminhao(Integer capacidadeCarga) {
        super();
        this.capacidadeCarga = capacidadeCarga;
    }
        
    public Caminhao(String marca, Integer ano, Double valor, Integer capacidade){
        super(marca, ano, valor); 
        this.capacidadeCarga = capacidade; 
    }
       
    public double calcularIPVA(){
        if (LocalDate.now().getYear() - this.getAno() > 20){
            return 0.0; 
        }
        else {
            return this.getValor() * 0.04; // usa getValor() porque o campo é privado na superclasse
        }   
    }

    public Integer getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(Integer capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }
    
    
    
}
