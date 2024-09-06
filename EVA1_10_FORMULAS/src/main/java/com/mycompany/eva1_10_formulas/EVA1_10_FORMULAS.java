/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_10_formulas;

import java.util.Scanner;

/**
 *
 * @author obeds
 */
public class EVA1_10_FORMULAS {

    public static void main(String[] args) {
        double vi, tm, a, r;
        Scanner ins;
        ins = new Scanner (System.in);
        System.out.println("ingresa la velocidad");
        vi = ins.nextInt();
        System.out.println("ingresa el tiempo");
        tm = ins.nextInt();
        System.out.println("ingresa la aceleración");
        a = ins.nextInt();
        r =vi * tm + (a*tm*tm)/2;
        System.out.println(r);
    }
}
