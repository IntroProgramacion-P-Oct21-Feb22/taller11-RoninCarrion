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
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        imprimirDatos(informacion);
    }

    public static void imprimirDatos(int[][] datos) {
        String datos_pares = "";
        for (int filas = 0; filas < datos.length; filas++) {
            for (int columnas = 0; columnas < datos[0].length; columnas++) {
                if ((datos[filas][columnas] % 2) == 0) {
                    datos_pares = String.format("%s %d",
                            datos_pares,
                            datos[filas][columnas]);
                }
            }
        }
        System.out.printf("Los valores pares encontrados son: "
                + "\n%s\n", datos_pares);
    }

}
