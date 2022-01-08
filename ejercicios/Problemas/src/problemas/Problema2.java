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
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        double dato_base;
        double dato_altura;
        int opcion_usuario;
        System.out.println("Ingresar el valor de la base de la figura: ");
        dato_base = entrada.nextDouble();
        System.out.println("Ingresar el valor de la altura de la figura: ");
        dato_altura = entrada.nextDouble();
        System.out.println("Con los datos ingresados, seleccione [1]Para "
                + "calcular el área de un cuadrado, [2]Para calcular el área"
                + " de un triángulo, o [3]Para calcular el área de un rectángulo.");
        opcion_usuario = entrada.nextInt();
        if (opcion_usuario == 1) {
            area_cuadrado(dato_base, dato_altura);
        } else {
            if (opcion_usuario == 2) {
                area_triangulo(dato_base, dato_altura);
            } else {
                if (opcion_usuario == 3) {
                    area_rectangulo(dato_base, dato_altura);
                }
            }
        }
    }

    public static void area_cuadrado(double a, double b) {
        double area_cuadrado;
        area_cuadrado = a * b;
        System.out.printf("El área obtenida de la figura es: %.2f\n",
                area_cuadrado);
    }

    public static void area_triangulo(double a, double b) {
        double area_triangulo;
        area_triangulo = (a * b) / 2;
        System.out.printf("El área obtenida de la figura es: %.2f\n",
                area_triangulo);
    }

    public static void area_rectangulo(double a, double b) {
        double area_rectangulo;
        area_rectangulo = a * b;
        System.out.printf("El área obtenida de la figura es: %.2f\n",
                area_rectangulo);
    }
}
