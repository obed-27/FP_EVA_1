/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_19_meses;

import java.util.Scanner;

/**
 *
 * @author obeds
 */
public class EVA1_19_MESES {

    public static void main(String[] args) {
        int MESES;
        Scanner mtr=new Scanner(System.in);
        System.out.println("inserte el mes en el que esta con numeros (1 al 12)");
        MESES=mtr.nextInt();
        if (MESES == 1){
           System.out.println("ENERO");
       }else if (MESES == 2){
           System.out.println("FEBRERO");
       }else if (MESES == 3){
           System.out.println("MARZO");
       }else if (MESES == 4){
           System.out.println("ABRIL");               
        }else if (MESES == 5){
            System.out.println("MAYO");
        }else if (MESES == 6){
            System.out.println("JUNIO");
        }else if (MESES == 7){
            System.out.println("JULIO");
        }else if (MESES == 8){
            System.out.println("AGOSTO");
        }else if (MESES == 9){
            System.out.println("SEPTIEMBRE");
        }else if (MESES == 10){
            System.out.println("OCTUBRE");
        }else if (MESES == 11){
            System.out.println("NOVIEMBRE");
        }else if (MESES == 12){
            System.out.println("DICIEMBRE");
        }else
        System.out.println("este numero no pertence a los puestos");
    }
}
