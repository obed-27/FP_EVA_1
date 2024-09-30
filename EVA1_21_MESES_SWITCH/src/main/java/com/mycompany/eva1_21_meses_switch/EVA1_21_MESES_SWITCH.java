/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_21_meses_switch;

import java.util.Scanner;

/**
 *
 * @author obeds
 */
public class EVA1_21_MESES_SWITCH {

    public static void main(String[] args) {
        int MESES;
        Scanner mtr=new Scanner(System.in);
        System.out.println("indica con numeros el mes que desees saber (1 al 12)");
        MESES=mtr.nextInt();
        switch(MESES){
            case 1:
                    System.out.println("ENERO");
                    break;
            case 2:
                    System.out.println("FEBRERO");
                    break;
            case 3:
                    System.out.println("MARZO");
                    break;
            case 4:
                    System.out.println("ABRIL");
                    break;
            case 5:
                    System.out.println("MAYO");
                    break;
            case 6:
                    System.out.println("JUNIO");
                    break;
            case 7:
                    System.out.println("JULIO");
                    break;
            case 8:
                    System.out.println("DOMINGO");
                    break;
            case 9:
                    System.out.println("DOMINGO");
                    break;
            case 10:
                    System.out.println("DOMINGO");
                    break;
            case 11:
                    System.out.println("DOMINGO");
                    break;
            case 12:
                    System.out.println("DOMINGO");
                    break;
            default:
                System.out.println("numero no valido");
    }
}
