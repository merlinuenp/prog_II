package capitulo_7;

public class Main {
    public static void main(String[] args) {
        Veiculo v[] = new Veiculo[3];  
        v[0] = new Caminhao();
        v[0].setAno(2010);
        v[0].setValor(100_000.0);        
        v[1] = new Motocicleta();
        v[1].setValor(10_000.0);
        v[1].setAno(2010);
        v[2] = new CaminhaoBiTrem();
        v[2].setAno(2010);
        v[2].setValor(1_000_000.0);
        
        for(Veiculo aux : v){
            System.out.println(aux.calcularIPVA());
        }
        
        
        
        
        
//        Caminhao c = new Caminhao("Ford", 2021, 1_000_000.0, 100);
//        System.out.println(c.calcularIPVA());  
//        
//        // testando calculo IPVA do CaminhaoBiTrem
//        CaminhaoBiTrem cbt = new CaminhaoBiTrem("Scania", 2020, 1_000_000.0, 100, 50);
//        System.out.println(cbt.calcularIPVA());
    }
    
}
