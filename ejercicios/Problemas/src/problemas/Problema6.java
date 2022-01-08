/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema6 {

    public static void main(String[] args) {
        double media_arreglo;
        double desviacion_obtenida;
        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};
        media_arreglo = media_aritmetica(informacion);
        desviacion_obtenida = obtener_desviacion(informacion, media_arreglo);
        System.out.printf("El valor de la media aritmética es: %.2f\n"
                + "El valor de la desviación estándar es: %.2f\n"
                , media_arreglo
                , desviacion_obtenida);
    }

    public static double media_aritmetica(int[] a) {
        int suma = 0;
        int media_aritmetica;
        for (int i = 0; i < a.length; i++) {
            suma = suma + a[i];
        }
        media_aritmetica = suma / a.length;
        return media_aritmetica;
    }

    public static double obtener_desviacion(int[] a, double b) {
        double desviacion = 0;
        double desviacion_final;
        for (int i = 0; i < a.length; i++) {
            desviacion = desviacion + Math.pow((a[i]-b), 2);
        }
        desviacion_final = desviacion / a.length;
        return desviacion_final;
    }
}
