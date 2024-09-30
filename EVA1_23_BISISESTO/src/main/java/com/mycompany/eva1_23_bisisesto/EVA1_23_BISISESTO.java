/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_23_bisisesto;

import java.util.Scanner;

/**
 *
 * @author obeds
 */
public class EVA1_23_BISISESTO {

    public static void main(String[] args) {
        int year, md1,md2;
        Scanner mtr=new Scanner(System.in);
        System.out.println("En que year te encuentras");
        year=mtr.nextInt();
       md1=year % 4;
       md2=year % 400;
       if (md1==0 || md2==0){
           System.out.println("year bisiesto");
       }else{
           System.out.println("year no bisiesto");
       }           
    }
}
