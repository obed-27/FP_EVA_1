/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_22_califa;

import java.util.Scanner;

/**
 *
 * @author obeds
 */
public class EVA1_22_CALIFA {

    public static void main(String[] args) {
        int cal;
        Scanner mtr=new Scanner(System.in);
        System.out.println("Inserte calificaciones");
        cal = mtr.nextInt();
        if (cal == 100 & cal <= 90){
            System.out.println("A");
        }else if (cal==89 & cal<=80){
            System.out.println("B");
        }else if (cal == 79 & cal<= 70){
            System.out.println("C");
        }else if (cal == 69 & cal <= 60){
            System.out.println("D");
        }else if (cal == 59 &  cal <= 50){
            System.out.println("F");
        }else{
            System.out.println("este numero no es valido o esta calificacion es menor a 50");
        }            
    }
}
