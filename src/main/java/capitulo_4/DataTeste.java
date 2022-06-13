package capitulo_4;

public class DataTeste {
    public static void main(String[] args) {
        // chamando o construtor vazio
        Data data1 = new Data();
        //chamando o segundo construtor 
        Data data2 = new Data(2022);
        // chamando o terceiro construtor
        Data data = new Data(10, 5, 2022);
        System.out.println(data.formatarData('/'));
        // ou
        String retorno = data.formatarData('/');
        System.out.println(retorno);
        
    }

}
