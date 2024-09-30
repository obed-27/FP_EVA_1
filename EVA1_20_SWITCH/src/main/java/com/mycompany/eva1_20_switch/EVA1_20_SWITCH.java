/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_20_switch;

import java.util.Scanner;

/**
 *
 * @author obeds
 */
public class EVA1_20_SWITCH {

    public static void main(String[] args) {
        int dia;
        Scanner mtr = new Scanner(System.in);
        System.out.println("numero del dia carrespondiente (1 al 7)");
        dia = mtr.nextInt();
        switch(dia){
            case 1:
                    System.out.println("DOMINGO");
                    break;
            case 2:
                    System.out.println("DOMINGO");
                    break;
            case 3:
                    System.out.println("DOMINGO");
                    break;
            case 4:
                    System.out.println("DOMINGO");
                    break;
            case 5:
                    System.out.println("DOMINGO");
                    break;
            case 6:
                    System.out.println("DOMINGO");
                    break;
            case 7:
                    System.out.println("DOMINGO");
                    break;
            default:
                System.out.println("numero no valido");
        }
    }
}
