package capitulo_7;

public class Main {
    public static void main(String[] args) {
        Caminhao c = new Caminhao("Ford", 2021, 1_000_000.0, 100);
        System.out.println(c.calcularIPVA());  
        
        // testando calculo IPVA do CaminhaoBiTrem
        CaminhaoBiTrem cbt = new CaminhaoBiTrem("Scania", 2020, 1_000_000.0, 100, 50);
        System.out.println(cbt.calcularIPVA());
    }
    
}
