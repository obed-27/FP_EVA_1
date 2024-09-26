/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_16_operador_or;

import java.util.Scanner;

/**
 *
 * @author obeds
 */
public class EVA1_16_OPERADOR_OR {

    public static void main(String[] args) {
        int km, meses;
        Scanner mtr = new Scanner (System.in);
        System.out.println("inserte el kilometraje");
        km = mtr.nextInt();
        System.out.println("inserte los meses");
        meses = mtr.nextInt();
        if (km >= 10000 || meses >= 6)
            System.out.println("revision necesaria");
        else
            System.out.println("revision no necesaria");       
    }
}
