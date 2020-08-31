/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.clase2.laboratorio;

import java.util.Scanner;

/**
 *
 * @author carlj
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

// Seccion para toma de datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu nombre");
        String Nombre = sc.nextLine();
        System.out.println("Escribe tu edad");
        int Edad = sc.nextInt();
        System.out.println("Escribe tu sexo");
        String Sexo = sc.nextLine();
        System.out.println("Escribe tu peso");
        float Peso = sc.nextFloat();
        System.out.println("Escribe tu Altura");
        float Altura = sc.nextFloat();

        Persona Persona1 = new Persona(Nombre, Edad, Sexo, Peso, Altura);
        System.out.println(Persona1.toString());

        Persona person1 = new Persona();
       person1.setEdad(18);
       System.out.println(person1.esMayor());
        
        
        
        
        
        
//        Persona Persona2 = new Persona(Persona1.getNombre(), Persona1.getEdad(), Persona1.getSexo());
////        System.out.println(Persona1.toString());
//
//        Persona Persona3 = new Persona();
//        Persona3.setNombre(Nombre);
//        Persona3.setEdad(Edad);
//        Persona3.setSexo(Sexo);
//        Persona3.setPeso(Peso);
//        Persona3.setAltura(Altura);
//        
        
        
        
        
        
        
        
        

//        System.out.println("Tu nombre es " + Nombre);
//        System.out.println("Tu edad es " + Edad + " Años ");
//        System.out.println("Tu sexo es " + Sexo);
//        System.out.println("Tu peso es " + Peso + " Libras ");
//        System.out.println("Tu Altura es " + Altura);
//        
    }

}
