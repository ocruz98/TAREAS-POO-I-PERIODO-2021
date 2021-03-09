/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Carro 
{
    private String marca;
    private String modelo;
    private String año;
    private String color;
    private String traccion;
    private String transmision;

    public Carro(){
    }
    public Carro(String marca, String modelo, String año, String Color, String traccion, String transmision){
    this.setMarca(marca);
    this.setModelo(modelo);
    this.setAño(año);
    this.setColor(color);
    this.setTraccion(traccion);
    this.setTransmision(transmision);}


    public String getMarca()
    {
        return marca;
    }
    public String getModelo()
    {
        return modelo;
    }
    public String getAño()
    {
        return año;
    }
    public String getColor()
    {
        return color;
    }
    public String getTraccion()
    {
        return traccion;
    }
    public String getTransmision()
    {
        return transmision;
    }
    public void setMarca(String _marca)
    {
        this.marca=_marca;
    }
    public void setModelo(String _modelo)
    {
        this.modelo=_modelo;
    }
    public void setAño(String _año)
    {
        this.año=_año;
    }
    public void setColor(String _color)
    {
        this.color=_color;
    }
    public void setTraccion(String _traccion)
    {
        this.traccion=_traccion;
    }
    public void setTransmision(String _transmision)
    {
        this.transmision=_transmision;
    }
}


