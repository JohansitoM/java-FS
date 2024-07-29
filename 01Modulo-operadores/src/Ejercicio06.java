public class Ejercicio06 {
    public static void main(String[] args) {
        int ladoCuadrado = 8;
        int areaCuadrado = ladoCuadrado * ladoCuadrado;
        int perimetroCuadrado = ladoCuadrado * 4;

        int baseTriangulo = 9;
        int alturaTriangulo = 8;
        int ladoUnoTriangulo = 8;
        int ladoDosTriangulo = 8;
        int areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
        int perimetroTriangulo = ladoUnoTriangulo + ladoDosTriangulo + baseTriangulo;

        int baseRectangulo = 8;
        int alturaRectangulo = 4;
        int areaRetangulo = baseRectangulo * alturaRectangulo;
        int perimetroRectangulo = (baseRectangulo + alturaRectangulo) * 2;

        System.out.println("El area del cuadrado es: " + areaCuadrado
        + "\nEl perimetro del cuadrado es: " + perimetroCuadrado
        + "\nEl area del triangulo es: " + areaTriangulo
        + "\nEl perimetro del triangulo es: " + perimetroTriangulo
        + "\nEl area del rectangulo es: " + areaRetangulo
        + "\nEl perimetro del rectangulo es: " + perimetroRectangulo);
    }
}
