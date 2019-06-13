/*--->  ENUNCIADO OK
Desarrollar un algoritmo que permita calcular los siguientes datos de una fiesta:
¿Cuántas personas asistieron a la fiesta?
¿Cuántos hombres y cuantas mujeres?
• Promedio de edades por sexo.
• La edad de la persona más joven que asistió.
Consideraciones
• No se permiten menores de edad a la fiesta.
• Ingresar datos hasta que se ingrese una edad igual a cero​.
 */
package ejercicio7;

import static java.lang.Double.isNaN;
import javax.swing.JOptionPane;

public class Ejercicio7 {

    private static boolean esNumero(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }/*Este método recibe una cadena y al parsearla nos damos cuenta si es un 
    número o no ya que solo los números permiten "Integer.parseInt" y esto me arroja un booleano true o false dependiendo si es o no número
     */

    public static void main(String[] args) {

        boolean e = false;
        int hombre = 0;
        int mujer = 0;
        int sumaHom = 0;
        int sumaMuj = 0;
        double promHom = 0;
        double promMuj = 0;

        while (e == false) {//While qu econtrola que ingresen a la fiesta hasta que digiten un '0' en la edad
            boolean a = true;
            boolean swGenero = false;//swiche para controlar el género.
            boolean swEdad = false;//swiche para controlar que la edad sea numerica.
            String genero = "";
            String sexo = "";
            String edad = "";

            while (swEdad == false /*&& Integer.parseInt(edad) != 0*/) {//Hasta que nos se ingresa una EDAD numérica no se finaliza el ciclo.
                edad = JOptionPane.showInputDialog("Ingrese Edad");

                if (esNumero(edad) == false) {
                    JOptionPane.showMessageDialog(null, "La EDAD debe ser un número");
                    swEdad = false;
                } else {
                    swEdad = true;
                    if (Integer.parseInt(edad) == 0) {
                        JOptionPane.showMessageDialog(null, "No hay mas cupo para ingresar a la fiesta");
                        e = true;
                        break;
                    } else {

                        if (Integer.parseInt(edad) < 18) {
                            JOptionPane.showMessageDialog(null, "No puede ingresar por ser menor de edad");
                            swEdad = false;
                        } else {
/////////////////////////////////////////////////////////////////////////////////////////////
                            while (swGenero == false && a == true) {//Hasta que nos se ingresa un género correcto no se finaliza el ciclo.
                                sexo = JOptionPane.showInputDialog("Ingrese su género:\n"
                                        + "1. Masculino\n"
                                        + "2. Femenino");
                                //este IF controla que sea numérico y que sea "1" o "2"
                                if ((esNumero(sexo) == false || (Integer.parseInt(sexo) != 1 && Integer.parseInt(sexo) != 2))) {
                                    JOptionPane.showMessageDialog(null, "Ingrese un género correcto");
                                    swGenero = false;
                                } else {
                                    switch (Integer.parseInt(sexo)) {
                                        case 1:
                                            genero = "Hombre";
                                            sumaHom = sumaHom + Integer.parseInt(edad);
                                            hombre++;
                                            break;
                                        case 2:
                                            genero = "Mujer";
                                            sumaMuj = sumaMuj + Integer.parseInt(edad);
                                            mujer++;
                                            break;
                                        default:
                                            genero = "";
                                            break;
                                    }
                                    swGenero = true;
                                }
                            }
/////////////////////////////////////////////////////////////////////////////////////////////
                            //JOptionPane.showMessageDialog(null, "Bienvenido");
                        }
                    }
                }
            }

            if (Integer.parseInt(edad) == 0) {
                a = false;
            } else {
                JOptionPane.showMessageDialog(null, "Bienvenido(a)...\n" + genero + " de\n" + edad + " años");
            }
        }
        promHom = (double) sumaHom / hombre;
        promMuj = (double) sumaMuj / mujer;
        
/*Si el valor final del promedio Mujer es NaN se convierte en 0 para imprimir*/
        if (isNaN(promMuj)) promMuj = 0;
        
/*Si el valor final del promedio Hombre es NaN se convierte en 0 para imprimir*/
        if (isNaN(promHom)) promHom = 0;

        JOptionPane.showMessageDialog(null, "Total de personas en la fiesta\n"
                + "Hombres: " + Math.round(hombre) + "\n"
                + "Mujeres: " + Math.round(mujer) + "\n"
                + "Promedio de edad de Hombres: " + promHom + "\n"
                + "Promedio de edad de Mujeres: " + promMuj
        );
    }
}
