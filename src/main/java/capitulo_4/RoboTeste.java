package capitulo_4;

public class RoboTeste {

    public static void main(String[] args) {
        Robo robo = new Robo("Juninho", 5, 20);
        System.out.println(robo.informarPosicao());
        robo.andarBaixo();
        System.out.println(robo.informarPosicao());
        robo.teletransportar(20, 20);
        System.out.println(robo.informarPosicao());
    }

}
