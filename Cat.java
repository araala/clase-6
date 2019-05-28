package com.mycompany.clase3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MB69479
 */
public class Cat {

    String name;
    String color;
    String agestr;
    Integer ageint;          

    public String talk() {
        return "miau";
    }

    public String datos() {
        return "El gato se llama: " + name
                + " y es de color: " + color
                + " su edad es: " + agestr;
    }
    
//    public static void main(String [] args, Integer [] argsi ) {
      public static void main(String[] args) {

        Cat rayo = new Cat();
        rayo.name = args[0];
        rayo.color = args[1];
        rayo.agestr = args[2];

        rayo.ageint = Integer.parseInt(rayo.agestr);
        
        System.out.println(rayo.talk());
        System.out.println(rayo.datos());
        
        if (rayo.ageint < 4) {
            System.out.println("Michu es un cachorro");
        } else if (rayo.ageint > 3 & rayo.ageint < 12) {
            System.out.println("Michu es un jovenazo");
        } else {
            System.out.println("Michu es un gato adulto");
        }
    }
}
