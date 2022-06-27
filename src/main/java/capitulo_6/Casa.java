package capitulo_6;


public class Casa {
    private Integer matricula;
    // String endereco;  // omitido para simplificação 
    // Double valor;     // omitido para simplificação 
    private Proprietario proprietario; 

    public Casa() {
        matricula = 0;
        proprietario = new Proprietario(); 
    }

    public Casa(Integer matricula, Proprietario proprietario) {
        this.matricula = matricula;
        this.proprietario = proprietario;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }
            

}
