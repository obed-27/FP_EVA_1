/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_5_entrada_datos;

import java.util.Scanner;

/**
 *
 * @author obeds
 */
public class EVA1_5_ENTRADA_DATOS {

    public static void main(String[] args) {
        //DECLARAMOS LAS VARIALES
        String marca;
        String modelo;
        int year;
        double precio;
        //como se captura la informacion
        //SCANER
        //herramienta-->clases
        Scanner ins;

        ins = new Scanner (System.in);
        //hay que indicar al ususario que capturar
        System.out.println("introduce la marca del automovil");
        //capturamos
        marca = ins.nextLine();//les regresa el texto hasta que le piques al enter
        System.out.println("introduce el modelo del automovil");
        modelo = ins.nextLine();
        System.out.println("introduce el año del carro");
        year = ins.nextInt();
        System.out.println("introduce el precio");
        precio = ins.nextDouble();
        System.out.println("-*datos capturados*-");
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(year);
        System.out.println(precio);
    }
}
