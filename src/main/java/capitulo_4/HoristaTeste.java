package capitulo_4;


public class HoristaTeste {
    public static void main(String[] args) {
        Horista horista = new Horista();
        horista.horasTrabalhadas = 10.0;
        horista.valorHora = 25.0;
        System.out.println(horista.calcularSalario());
    }

}
