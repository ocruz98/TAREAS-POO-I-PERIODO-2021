package modulo5;
import helpers.Cuadrado;
import helpers.Circulo;
import helpers.Rectangulo;
import helpers.Triangulo;
import helpers.Linea;
//LINK DEL VIDEO https://youtu.be/EnB1kg3iAD4
public class Modulo5
{
    public static void main(String[] args) 
    {
        Cuadrado cuadrado = new Cuadrado();
        Circulo circulo=new Circulo();
        Rectangulo rectangulo= new Rectangulo();
        Triangulo triangulo=new Triangulo();
        Linea linea=new Linea();
        
        cuadrado.imprimir();
        cuadrado.Valor(4,5);

        circulo.imprimir();
        circulo.Valor(5);

        rectangulo.imprimir();
        rectangulo.Valor(2,4);

        triangulo.imprimir();
        triangulo.Valor(2,4);
        
        linea.imprimir();
    }

}
