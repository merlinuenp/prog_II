package capitulo_7;

import java.time.LocalDate;


public class CaminhaoBiTrem extends Caminhao {
    private Integer capacidadeCargaAdicional; 
    
    public CaminhaoBiTrem(){
        super();
        this.capacidadeCargaAdicional = 0; 
    }

    public CaminhaoBiTrem(String marca, 
            Integer ano, Double valor, Integer capacidade, Integer capacidadeCargaAdicional) {
        super(marca, ano, valor, capacidade);
        this.capacidadeCargaAdicional = capacidadeCargaAdicional;
    }
    
    @Override
    public double calcularIPVA(){
        if (LocalDate.now().getYear() - getAno() > 20){
            return 0.0; 
        }
        else {
            return getValor() * 0.045;
        }  
    }

    // gets e sets...
    public Integer getCapacidadeCargaAdicional() {
        return capacidadeCargaAdicional;
    }

    public void setCapacidadeCargaAdicional(Integer capacidadeCargaAdicional) {
        this.capacidadeCargaAdicional = capacidadeCargaAdicional;
    }
    
    
}
