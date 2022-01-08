/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema7 {

    public static void main(String[] args) {
        String[] ciudades;
        ciudades = obtener_arreglo();
        caracteres(ciudades);
    }

    public static String[] obtener_arreglo() {
        Scanner entrada = new Scanner(System.in);
        int cant_valor;
        System.out.println("Escribir la cantidad de "
                + "elementos que desea ingresar: ");
        cant_valor = entrada.nextInt();
        entrada.nextLine();
        String[] a = new String[cant_valor];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Ingresar una ciudad del Ecuador: ");
            a[i] = entrada.nextLine();
        }
        return a;
    }
    public static void caracteres(String[]a){
        int cant_valores;
        String acumulador = ""; 
        for(int i = 0; i<a.length; i++){
            cant_valores = a[i].length();
            if(cant_valores == 4 || cant_valores == 5){
                acumulador = String.format("%s | %s", acumulador, a[i]);
            }
        }
        System.out.printf("Las ciudades con 5 o 4 caracteres dentro del "
                + "arreglo son: %s\n", acumulador);
    }
}
