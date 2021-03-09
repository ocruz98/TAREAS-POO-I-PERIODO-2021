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
public class Hospital 
{
    private String nombre;
    private int edad;
    private String exp;
    private String pais;
    private String director;
    public Hospital(){}
    public Hospital(String nombre, int edad, String exp, String pais, String director)
    {
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setExp(exp);
        this.setPais(pais);
        this.setDirector(director);
    }
    public String getNombre()
    {
        return nombre;
    }
    public int getEdad()
    {
        return edad;
    }
    public String getExp()
    {
        return exp;
    }
    public String getPais()
    {
        return pais;
    }
    public String getDirector()
    {
        return director;
    }
    public void setNombre(String _nombre)
    {
        this.nombre=_nombre;
    }
    public void setEdad(int _edad)
    {
        this.edad=_edad;
    }    
    public void setExp(String _exp)
    {
        this.exp=_exp;
    }
    public void setPais(String _pais)
    {
        this.pais=_pais;
    }
    public void setDirector(String _director)
    {
        this.director=_director;
    }
    public void imprimirNombre()
    {
        System.out.println(nombre);
    }
    public void imprimirEdad()
    {
        System.out.println("Su edad es: "+edad+" años");
    }
    public void imprimirExp()
    {
        System.out.println(exp);
    }
    public void imprimirPais()
    {
        System.out.println(pais+ ": Hospital Vicente D'Antoni, Medicentro, Hospital Atlantida");
    }
    public void imprimirDirector()
    {
        System.out.println(director);
    }
}
