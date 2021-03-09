/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package encapsulamientoabstraccion;
import helpers.Hospital;

/* LINK AL VIDEO: https://youtu.be/oR8tOA588gI
 *
 * @author Oscar Cruz
 */
public class EncapsulamientoAbstraccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Hospital hospital=new Hospital();
        hospital.setNombre("Pamela Duarte");
        hospital.setEdad(32);
        hospital.setExp("10 años");
        hospital.setPais("Honduras");
        hospital.setDirector("Oscar");
        hospital.imprimirNombre();
        hospital.imprimirEdad();
        hospital.imprimirExp();
        hospital.imprimirPais();
        hospital.imprimirDirector();
    }

}
