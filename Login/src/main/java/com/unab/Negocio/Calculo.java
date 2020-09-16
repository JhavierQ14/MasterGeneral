/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.Negocio;

/**
 *
 * @author carlj
 */
public class Calculo {

    dominio dominio = new dominio();
    
    
    Double Lab1 = Double.parseDouble(txtLab1.getLab1())*40;
    Double Par1 = Double.parseDouble(txtPar1.getText())*60;
    Double R = dominio.Periodo1(Lab1,Par1);
   
   txtResultadoPrimerPeriodo.setText (respuesta.toString());
     
     
    Double Lab2 = Double.parseDouble(txtLab2.getLab1())*40;
    Double Par2 = Double.parseDouble(txtPar2.getText())*60;
    Double R = dominio.Periodo2(Lab2,Par2);
   
   txtResultadoPrimerPeriodo.setText (respuesta.toString());
     
    Double Lab3 = Double.parseDouble(txtLab3.getLab1())*40;
    Double Par3 = Double.parseDouble(txtPar2.getText())*60;
    Double R = dominio.Periodo2(Lab3,Par3);

    txtResultadoTercerPeriodo.setText (respuesta.toString());

     
     
}
