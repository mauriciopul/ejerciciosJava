/*--->  ENUNCIADO OK
un grupo de 10 estudiantes presentan un examen de Física. Hacer un algoritmo que lea por cada estudiante la calificación obtenida. 
Al finalizar calcule e imprima:​
​• not1 = La cantidad de estudiantes que obtuvieron una calificación menor a 50.
• not2 = La cantidad de estudiantes que obtuvieron una calificación de 50 o más pero menor que 70.
• not3 = La cantidad de estudiantes que obtuvieron una calificación de 70 o más pero menor que 80.
• not4 = La cantidad de estudiantes que obtuvieron una calificación de 80 o más.
La calificación obtenida en el examen de física debe ser entre 1 y 100.​
 */
package ejercicio9;

import javax.swing.JOptionPane;

public class Ejercicio9 {
    //Validar que el dato ingresado sea número
    private static boolean esNumero(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public static void main(String[] args) {
        String nota = "";

        int not1 = 0;     //  menor a 50.
        int not2 = 0;     //  50 o más pero menor que 70.
        int not3 = 0;     //  70 o más pero menor que 80.
        int not4 = 0;     //  80 o más.
        String notas[] = new String[10];
        String esp = "     ";

        for (int i = 0; i < 10; i++) {
            boolean aNota = false;

            while (aNota == false) {
                nota = JOptionPane.showInputDialog("ESTUDIANTE " + (1 + i) + "\n"
                        + "Ingrese una nota entre 1 y 100");

                if (esNumero(nota) == false || Integer.parseInt(nota) < 1 || Integer.parseInt(nota) > 100) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar una nota válida (entero entre 1 y 100)");
                    aNota = false;
                } else {
                    if (Integer.parseInt(nota) < 50) {
                        not1++;
                    }
                    if (Integer.parseInt(nota) >= 50 && Integer.parseInt(nota) < 70) {
                        not2++;
                    }
                    if (Integer.parseInt(nota) >= 70 && Integer.parseInt(nota) < 80) {
                        not3++;
                    }
                    if (Integer.parseInt(nota) >= 80) {
                        not4++;
                    }
                    notas[i] = nota;
                    aNota = true;
                }
            }
        }
        //Imprimir las notas en un listado
        String imp = "";
        for (int i = 0; i < 10; i++) {
            int cont = 1 + i;
            imp = imp + cont + ":" + esp + notas[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, "Total Notas\n" + imp);

        //Imprimir lo que requieren
        JOptionPane.showMessageDialog(
                null, "Cantidad de estudiantes según sus NOTAS\n"
                + "Menor a 50:" + esp + not1 + "\n"
                + "Entre 50 y 70:" + esp + not2 + "\n"
                + "Entre 70 y 80:" + esp + not3 + "\n"
                + "Mayor a 80:" + esp + not4 + "\n"
        );
    }
}
