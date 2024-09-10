/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_11_if;

import java.util.Scanner;

/**
 *
 * @author obeds
 */
public class EVA1_11_IF {

    public static void main(String[] args) {
        Scanner ins;
        ins = new Scanner (System.in);
        int edad;
        System.out.println("inserta tu edad");
        edad = ins.nextInt();
        if(edad>=18){
            System.out.println("Es un adulto");
         }else{
            System.out.println("Es un menor de edad");
            }
            
    }
}
