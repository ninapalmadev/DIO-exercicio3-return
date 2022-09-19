public class Main {

    public static void main(String[] args) {
        //Return
        System.out.println("Exercício retorno - Quadriláteros");


        double areaQuadrado = Quadrilateros.area(5);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilateros.area(5, 3);
        System.out.println("Área do retângulo: " + areaRetangulo);

        double areaTrapezio = Quadrilateros.area(5, 3,9);
        System.out.println("Área do trapézio: " + areaTrapezio);
    }
}
