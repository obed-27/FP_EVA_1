/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_12_califas;

import java.util.Scanner;

/**
 *
 * @author obeds
 */
public class EVA1_12_CALIFAS {

    public static void main(String[] args) {
        Scanner mtr;
        int clf;
        mtr = new Scanner (System.in);    
        System.out.println("inserta la calificacion");
        clf = mtr.nextInt();
        if (clf>=70){
            System.out.println("calificacion aprobatoria");
        }else{
            System.out.println("N.A.");
        }
        
    }
}
