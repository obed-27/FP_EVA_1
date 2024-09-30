/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_18_ife_else;

import java.util.Scanner;

/**
 *
 * @author obeds
 */
public class EVA1_18_IFE_ELSE {

    public static void main(String[] args) {
        int dia;
        Scanner mtr = new Scanner(System.in);
        System.out.println("numero del dia carrespondiente (1 al 7)");
        dia = mtr.nextInt();
       if (dia == 1){
           System.out.println("domingo");
       }else if (dia == 2){
           System.out.println("lunes");
       }else if (dia == 3){
           System.out.println("martes");
       }else if (dia == 4){
           System.out.println("miercoles");               
        }else if (dia == 5){
            System.out.println("jueves");
        }else if (dia == 6){
            System.out.println("viernes");
        }else if (dia == 7){
            System.out.println("sabado");
        }else
        System.out.println("este numero no pertence a los puestos");
    }
}
