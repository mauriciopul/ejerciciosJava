/*--->  ENUNCIADO OK
hacer un algoritmo que imprima el costo de una llamada telefónica, capturando la duración de 
la llamada en minutos y conociendo lo siguiente:
• Toda llamada que dure tres minutos o menos tiene un costo de $200.
• Cada minuto adicional cuesta $30.​​
 */
package ejercicio8;

import javax.swing.JOptionPane;

public class Ejercicio8 {

    //Validador de numero
    private static boolean esNumero(String cadena) {//Ingresamos un string
        try {
            Integer.parseInt(cadena);//Si al convertirlo en entero no sale error
            return true;            //regresamos un true
        } catch (NumberFormatException nfe) {//Si no es entero regresamos un false
            return false;
        }
    }

    public static void main(String[] args) {

        String min = "";
        boolean aMin = false;
        int vlrLlam = 0;

        while (aMin == false) {
            min = JOptionPane.showInputDialog("Ingrese la cantidad de minutos consumidos");
            if (esNumero(min)) {
                aMin = true;
            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar un número");
                aMin = false;
            }
        }
        if (Integer.parseInt(min) == 0) {
            JOptionPane.showMessageDialog(null, "No ha gastado minutos.\nLa llamada no tiene costo.");
        } else {
            if (Integer.parseInt(min) < 4) {
                vlrLlam = 200;
            } else {
                vlrLlam = 200 + ((Integer.parseInt(min) - 3) * 30);
            }
        }
        if (Integer.parseInt(min) != 0) {
            JOptionPane.showMessageDialog(null, "Minutos consumidos: " + min + "\n"
                    + "Costo de la llamada: " + vlrLlam);
        }
    }
}
