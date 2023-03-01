/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operadores_y_condicionales;

/**
 *
 * @author karla
 */
public class Operadores_y_condicionales {

    public static void main(String[] args) {
        double vdolar = 18.37;
        double iva = 0.16;
        double dolar = 150;
        double conversion = vdolar * dolar;
        double aplicaiva = iva * conversion;
        System.out.println("un dolar equivale a: $" + vdolar + " pesos");
        System.out.println("se ingresaron $" + dolar + " que equivalen a " + conversion + " pesos");
        if(conversion>2000){
            System.out.println("se aplico iva el total es " + (aplicaiva + conversion));
        }
    }
}
