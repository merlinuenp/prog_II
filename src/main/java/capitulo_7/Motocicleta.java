
package capitulo_7;

import java.time.LocalDate;

public class Motocicleta extends Veiculo{
    private Integer cilindradas; 
    
    public Motocicleta(){
        this.cilindradas = 0; 
    }

    public Integer getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(Integer cilindradas) {
        this.cilindradas = cilindradas;
    }
    
    public double calcularIPVA(){
        if (LocalDate.now().getYear() - this.getAno() > 20){
            return 0.0; 
        }
        else {
            return this.getValor() * 0.02; // usa getValor() porque o campo é privado na superclasse
        }   
    }
    
}
