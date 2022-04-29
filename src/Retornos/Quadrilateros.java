package Retornos;

public class Quadrilateros {

//    Quadrado

    public static double area(double lado) {
        return lado * lado;
    }

//    Retângulo

    public static double area(double lado1, double lado2) {
        return lado1 * lado2;
    }

//    Trapézio

    public static double area(double ladoMaior, double ladoMenor, double altura) {
        return ((ladoMaior+ladoMenor)*altura) / 2;
    }
}
