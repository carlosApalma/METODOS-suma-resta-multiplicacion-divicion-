/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

/**
 *
 * @author carlo
 */
public class Calculadora {

    public static void main(String[] args) {
     Operaciones op=new Operaciones();
     op.leerNumeros();
     op.suma();
     op.resta();
     op.multiplicacion();
     op.dividir();
     op.motrarResultados();
    }
}
