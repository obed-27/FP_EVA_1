/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_15_contra;

import java.util.Scanner;

/**
 *
 * @author obeds
 */
public class EVA1_15_CONTRA {

    public static void main(String[] args) {
        final String USE = "Obed" ;
        final String CON = "fimbr3s" ;
        String user, contra;
        Scanner mtr = new Scanner (System.in);
        System.out.println("USUARIO");
        user = mtr.nextLine();
        System.out.println("PASWORD");
        contra = mtr.nextLine();
        if (user.equals(USE) && contra.equals(CON))
                System.out.println("acceso concedido");
        else{
                System.out.println("acceso denegado");
    }
    }
}
