/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Modulo3 {

    public static void main(String[] args) {
    Carro carro=new Carro();
    carro.setMarca("Toyota");
    carro.setModelo("Corolla");
    carro.setAño("2007");
    carro.setColor("Gris");
    carro.setTraccion("Delantera");
    carro.setTransmision("Manual");

    System.out.println("Marca: "+carro.getMarca());
    System.out.println("Modelo: "+carro.getModelo());
    System.out.println("Año: "+carro.getAño());
    System.out.println("Color: "+carro.getColor());
    System.out.println("Tracción: "+carro.getTraccion());
    System.out.println("Transmision: "+carro.getTransmision());

    }

}
