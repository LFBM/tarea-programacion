/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carro;

/**
 *
 * @author Felipe
 */
public class Carro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo obj1 = new Vehiculo ();
        
        obj1.setCarro("Ford");
        obj1.setColor("Gris");
        obj1.setKilometraje(3020);
     
     
     System.out.println(obj1.getCarro());
     System.out.println(obj1.getColor());
     System.out.println(obj1.kilometraje);
    }
    }
    

