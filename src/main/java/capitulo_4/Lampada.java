package capitulo_4;

public class Lampada {

    boolean acesa;

    // construtor vazio 
    Lampada() {
        acesa = false;
    }
    
    Lampada( boolean acesa ){
        this.acesa = acesa; 
    }

    void acender() {
        acesa = true;
    }

    void apagar() {
        acesa = false;
    }

    String mostrarEstado() {
        if (acesa == true) {
            return ("acesa");
        } else {
            return ("apagada");
        }
    }

}
