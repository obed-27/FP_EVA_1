/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_14_asienda;

import java.util.Scanner;

/**
 *
 * @author obeds
 */
public class EVA1_14_ASIENDA {

    public static void main(String[] args) {
        char mf;
        Scanner mtr;
        mtr = new Scanner (System.in);
        System.out.println("fisicas = F ");
        System.out.println("morales = M ");
        mf = mtr.nextLine().charAt(5);
        if(mf == 'F'){
            System.out.println("persona fisica");}
        else{
            System.out.println("persona moral");
    }
    }
}
