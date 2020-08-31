/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.clase2.laboratorio;

/**
 *
 * @author carlj
 */
public class Persona {

    private String Nombre;
    private int Edad;
    private String Sexo;
    private float Peso;
    private float Altura;

    public Persona(String Nombre, int Edad, String Sexo, float Peso, float Altura) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Sexo = Sexo;
        this.Peso = Peso;
        this.Altura = Altura;
    }

    public Persona(String Nombre, int Edad, String Sexo) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Sexo = Sexo;
    }

    public Persona() {
    }

    public String esMayor() {
        int Edad;
        Edad = this.Edad;
        if (Edad < 18) {
            return "Eres menor de edad";
        } else {
            return "Eres mayor de edad";

        }

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public float getPeso() {
        return Peso;
    }

    public void setPeso(float Peso) {
        this.Peso = Peso;
    }

    public float getAltura() {
        return Altura;
    }

    public void setAltura(float Altura) {
        this.Altura = Altura;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre = " + Nombre + ", Edad = " + Edad + ", Sexo = " + Sexo + ", Peso = " + Peso + ", Altura = " + Altura + '}';
    }

}
