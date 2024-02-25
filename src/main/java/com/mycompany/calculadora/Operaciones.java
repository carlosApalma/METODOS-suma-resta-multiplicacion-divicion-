/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

/**
 *
 * @author carlo
 */
import javax.swing.JOptionPane;
public class Operaciones {
    //Atributos
    int numero1;
    int numero2;
    int suma; 
    int resta;
    int multiplicacion;
    int divicion;
    
    //Metodos
    
    public void leerNumeros(){
      numero1=Integer.parseInt(JOptionPane.showInputDialog("Coloca el num 1"));
      numero2=Integer.parseInt(JOptionPane.showInputDialog("Coloca el num 2"));
        }
    //Metodo de suma 
    
    public void suma(){
    suma=numero1+numero2;
    }
    public void resta(){
    resta=numero1-numero2;
    }
    public void multiplicacion(){
    }
    public void dividir(){
    divicion=numero1/numero2;
    }
    public void motrarResultados(){
        System.out.println("la suma es: "+suma);
        System.out.println("la resta es: "+resta);
        System.out.println("la multiplicacion es: "+multiplicacion);
        System.out.println("la division es: "+divicion);
        }
    
  

}
