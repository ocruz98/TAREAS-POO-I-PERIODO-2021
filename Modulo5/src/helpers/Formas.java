package helpers;
public class Formas 
{
    private String color;
    private String formula;
    private String dibujar;
    public Formas(){}
    public void establecerColor(String color)
    {
        this.color=color;
    }
    public String obtenerColor()
    {
        return this.color;
    }
    public void establecerFormula(String formula)
    {
        this.formula=formula;
    }
    public String obtenerFormula()
    {
        return this.formula;
    }
    public void dibujar(String dibujar)
    {
        this.dibujar=dibujar;
    }
    public String obtenerdibujar()
    {
        return this.dibujar;
    }
    public void imprimir()
    {
        System.out.println("Nombre: "+dibujar);
        System.out.println("Color: "+color);
        System.out.println("Formula: "+formula);
    }
}
