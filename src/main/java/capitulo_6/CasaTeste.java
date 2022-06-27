
package capitulo_6;


public class CasaTeste {
    public static void main(String[] args) {
        // criando um proprietario e depois a casa
        Proprietario p = new Proprietario("99.745.874-89", "Mordekay");
        Casa casa1 = new Casa(1, p);
        
        // instanciando um proprietario na chamada ao construtor da casa 
        Casa casa2 = new Casa(2, new Proprietario("11.111.111-00", "Rigby"));
        // como acessar o nome do proprietario da casa 2? 
        System.out.println(casa2.getProprietario().getNome());
        
        // e se eu quise alterar o nome do proprietario da casa 1? 
        casa1.getProprietario().setNome("Paiolito");
        // como o proprietario da casa1 é referenciado por uma variável nomeada...
        System.out.println(p.getNome());  // vai exibir o novo nome 
        System.out.println(casa1.getProprietario().getNome());
    }

}
