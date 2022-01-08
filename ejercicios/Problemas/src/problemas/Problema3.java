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
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nota_cualitativa;
        String acumulador_notas = "";
        double[] notas_cuantitativas = new double [4];
        
        for (int i = 0; i < notas_cuantitativas.length; i++) {
            System.out.println("Ingresar una nota obtenida por el estudiante: ");
            notas_cuantitativas[i] = entrada.nextDouble();
            acumulador_notas = String.format("%s %.2f",
                     acumulador_notas, notas_cuantitativas[i]);    
        }
        nota_cualitativa = cualitativo(notas_cuantitativas);
        System.out.printf("El promedio de las notas: %s es %s\n"
                , acumulador_notas
                , nota_cualitativa);
    }

    public static String cualitativo(double [] notas) {
        double promedio_cuantitativo;
        double suma = 0;
        String promedio_cualitativo = "";
        for (int i = 0; i < notas.length; i++) {
            suma = suma + notas[i];
        }
        promedio_cuantitativo = suma / notas.length;
        if (promedio_cuantitativo >= 0 && promedio_cuantitativo < 5) {
            promedio_cualitativo = "Regular";
        } else {
            if (promedio_cuantitativo >= 5 && promedio_cuantitativo < 8) {
                promedio_cualitativo = "Bueno";
            } else {
                if (promedio_cuantitativo >= 8 && promedio_cuantitativo < 9) {
                    promedio_cualitativo = "Muy Bueno";
                } else {
                    if (promedio_cuantitativo >= 9 && promedio_cuantitativo <= 10) {
                        promedio_cualitativo = "Sobresaliente";
                    }
                }
            }
        }
        return promedio_cualitativo;
    }
}
