public class Ejercicio03 {
    public static void main(String[] args) {
        int numeroUno = 8;
        int numeroDos = 2;
        int temporal = numeroUno;

        numeroUno = numeroDos;
        numeroDos = temporal;

        System.out.println("El número uno es " + numeroUno +
        "\nEl número dos es " + numeroDos);
    }
}
