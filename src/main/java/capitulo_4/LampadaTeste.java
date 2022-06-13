package capitulo_4;

public class LampadaTeste {

    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        System.out.println(lampada.mostrarEstado());
        lampada.acender();
        System.out.println(lampada.mostrarEstado());
        lampada.apagar();
        System.out.println(lampada.mostrarEstado());

    }

}
