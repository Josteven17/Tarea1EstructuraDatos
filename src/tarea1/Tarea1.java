/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

import java.util.Scanner;


/**
 *
 * @author josep
 */
public class Tarea1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        byte cantidad = 0;
        int columna1 = 0;
        int columna2 = 0;
        int total = 0;
        System.out.println("Ingrese la cantidad de filas y columnas");
        cantidad = read.nextByte();
        int arreglo [][] = new int [cantidad][cantidad];
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length; j++) {
                byte numero = (byte) (Math.random()*100);
                if (i==j) {
                    columna1 += numero;
                }
                if (i+j == cantidad-1) {
                    columna2 += numero;
                }
                
                arreglo [i][j] = numero;
                System.out.print(" " + arreglo[i][j]);
            }
            System.out.println("");
        }
        total = columna1+columna2;
        System.out.println("El total de la columna 1 es: " +  columna1 + "\nEl total de la columna 2 es: " + columna2 + "\nLa sumatoria total es: " + total);
    }
    
}
