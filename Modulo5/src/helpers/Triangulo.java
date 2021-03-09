/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package helpers;

/**
 *
 * @author Oscar Cruz
 */
public class Triangulo extends Formas
{
    public Triangulo()
    {
        dibujar("Triangulo");
        establecerColor("Verde"); 
        establecerFormula("(Base x Altura)/2");
    }
    public void Valor(int x, int y)
    {
        int dato=0, z=0;
        dato=x*y;
        z=dato/2;
        System.out.println("("+x+" x "+y+")/2 = "+z);
    }
}
