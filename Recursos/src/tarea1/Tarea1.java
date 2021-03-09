/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tarea1;

/**
 *
 * @author Usuario
 */
public class Tarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int suma=0, resta=0, multi=0, divi=0, m=6, t=1, k=-10, e=3;
    String[] ciu=new String[20];
    ciu[0]="La Ceiba";
    ciu[1]="Roatan";
    ciu[2]="Tegucigalpa";
    ciu[3]="San Pedro Sula";
    ciu[4]="Puerto Cortes";
    ciu[5]="El Progreso";
    ciu[6]="Choluteca";
    ciu[7]="Comayagua";
    ciu[8]="Choloma";
    ciu[9]="Danli";
    ciu[10]="Santa Rosa de Copan";
    ciu[11]="Siguatepeque";
    ciu[12]="Juticalpa";
    ciu[13]="Tela";
    ciu[14]="La Lima";
    ciu[15]="Olancho";
    ciu[16]="Catacamas";
    ciu[17]="Trujillo";
    ciu[18]="Omoa";
    ciu[19]="Tocoa";
    suma=m+t;
    resta=m-t;
    multi=m*k;
    divi=m/e;
    System.out.println("Hola, soy Oscar, de la clase de Programación Orientada a Objetos");
    System.out.println("La suma entre "+m+" y "+t+", es "+suma);
    System.out.println("La resta entre "+m+" y "+t+", es "+resta);
    System.out.println("La multiplicacion entre "+m+" y "+k+", es "+multi);
    System.out.println("La division entre "+m+" y "+e+", es "+divi);
    if(m>t){System.out.println("Verdadero");}
    else {System.out.println("Falso");}
    if (t/k==-5){System.out.println("Verdadero");}
    else{System.out.println("Falso");}
    if (m+t==7||m-t==5){System.out.println("Verdadero");}
    else {System.out.println("Falso");}
    for (int i=0; i<=19; i++)
    {System.out.println("Ciudad: "+ciu[i]);}
    for(int x=2; x<=100; x=x+2)
    {System.out.println("Numero par: "+x);}
    
    }

}
