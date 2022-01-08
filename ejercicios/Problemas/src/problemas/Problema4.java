/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
    String nombre_usuario;
    String cedula;
    int dato_calcular;
        System.out.println("Ingresar el nombre del cliente: ");
        nombre_usuario = entrada.nextLine();
        System.out.println("Ingresar el número de cédula del cliente: ");
        cedula = entrada.nextLine();
        System.out.println("Ingresar[1]para calcular el valor de la planilla"
                + " de Luz. [2]Si desea calcular el valor del "
                + "bien inmueble pulse: ");
        dato_calcular = entrada.nextInt();
        if(dato_calcular == 1){
            planilla_luz(nombre_usuario, cedula);
        }else{
            if(dato_calcular == 2){
            valor_inmueble(nombre_usuario, cedula);
        } else{
                System.out.println("Los valores ingresados no están dentro "
                        + "de las opciones que se le ha presentado");
            }
        }
    }
    public static void planilla_luz(String a, String b){
    Scanner entrada = new Scanner(System.in);
    entrada.useLocale(Locale.US);
    double valor_kwhora;
    double num_kwmes;
    double pago_planilla;
        System.out.println("Ingresar el valor del Kilowatio/hora: ");
        valor_kwhora = entrada.nextDouble();
        System.out.println("Ingresar la cantidadd de Kilowatios "
                + "consumidos en el mes: ");
        num_kwmes = entrada.nextDouble();
        pago_planilla = valor_kwhora * num_kwmes;
        System.out.printf("Cliente %s con cédula %s debe cancelar "
                + "el valor de $%.2f\n", a, b, pago_planilla);
    }
    public static void valor_inmueble(String a, String b){
    Scanner entrada = new Scanner(System.in);
    entrada.useLocale(Locale.US);
    double valor_inmueble;
    double valor_predio = 0.02;
    double pago_total;
    System.out.println("Ingresar el valor del Inmueble: ");
        valor_inmueble = entrada.nextDouble();
        pago_total = valor_inmueble * valor_predio;
        System.out.printf("Cliente %s con cédula %s debe cancelar "
                + "el valor de $%.2f\n", a, b, pago_total);
    }
}
