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
public class Rectangulo extends Formas
{
    public Rectangulo()
    {
        dibujar("Rectangulo");
        establecerColor("Naranja"); 
        establecerFormula("Base x Altura");
    }
    public void Valor(int x, int y)
    {
        int dato=x*y;
        System.out.println(+x+" x "+y+" = "+dato);
    }
}
