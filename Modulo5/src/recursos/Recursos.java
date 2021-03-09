/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package recursos;

/**
 *
 * @author Usuario
 */
//import java.util.Scanner;
public class Recursos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int x=6, y=2, z=0;
        Cadena recursos = new Cadena();
        recursos.PrimerMetodo();
        recursos.SegundoMetodo(22);
        recursos.TercerMetodo(x,y);
        recursos.CuartoMetodo(10);
    }
    public static class Cadena
    {
        public void PrimerMetodo()
        {
            System.out.println("Programacion Orientada a Objetos 2021");
        }
    
        public void SegundoMetodo(int x)
        {
            if(x>=18)
            {
                System.out.println("Eres mayor de edad");
            }
            else
            {
                System.out.println("Eres menor de edad");
            }
        }
        public void TercerMetodo(int x, int y)
        {
            int mult=x*y;
            System.out.println("La multiplicacion entre "+x+" y "+y+" es "+mult);
        }
        /*public void CuartoMetodo(int x)
        {
            
        }*/
        public void CuartoMetodo(int x)
        {
            for(int i=1; i<=x; i++)
            {
                System.out.println(""+i);
            }
        }
    
   }
}

        
