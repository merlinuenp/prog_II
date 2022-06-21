package capitulo_6;

import java.util.ArrayList;

public class RoboTeste {
    
    public static void main(String[] args) {
        // Criando um vetor de robôs
        Robo vetor[] = new Robo[3];
        vetor[0] = new Robo("Mordekay", new Ponto(10, 10));
        vetor[1] = new Robo("Rigby", new Ponto(20, 20));
        vetor[2] = new Robo("Benson", new Ponto(150, 30));
        // exibindo 
        for (int i=0; i < 3; i++){
            System.out.println(vetor[i].getNome() + " Posição: " + vetor[i].mostrarPosicao());
        }
        // segunda opção: usando propriedade do vetor 
        for (int i=0; i < vetor.length; i++){
            System.out.println(vetor[i].getNome() + " Posição: " + vetor[i].mostrarPosicao());
        }
        // terceira opção: usando for reduzido
        for(Robo r : vetor){
            System.out.println(r.getNome() + " Posição: " + r.mostrarPosicao());
        }
        
        
        System.out.println("\n\n\n");
        // com ArrayList
        ArrayList<Robo> lista = new ArrayList(); 
        lista.add(new Robo("Bender", new Ponto(10, 10)));
        lista.add(new Robo("Leela", new Ponto(100, 10)));
        lista.add(new Robo("Zoid", new Ponto(1000, 10)));
        // percorrendo a lista
        for(Robo r : lista){
            System.out.println(r.getNome() + " \tPosição: " + r.mostrarPosicao());
        }
        
    }

}
