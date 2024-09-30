/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_17_rango;

import java.util.Scanner;

/**
 *
 * @author obeds
 */
public class EVA1_17_RANGO {

    public static void main(String[] args) {
        int cali;
        Scanner mtr=new Scanner (System.in);
        System.out.println("inserte la calificacion");
        cali=mtr.nextInt();
        if (cali <= 100 & cali >=70)
            System.out.println("calificacion aprobatoria");
        else
            System.out.println("NA");
    }
}
