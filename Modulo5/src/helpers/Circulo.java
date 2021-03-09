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
public class Circulo extends Formas
{
    public Circulo()
    {
        dibujar("Circulo");
        establecerColor("Azul"); 
        establecerFormula("π x radio²");
    }
    public void Valor(int x)
    {
        double dato=0, pi=3.1415, y=x*x;
        dato=pi*y;
        System.out.println("3.1415 x "+x+"² = "+dato);
    }
}
