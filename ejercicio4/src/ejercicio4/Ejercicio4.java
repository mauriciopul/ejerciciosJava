/*--->  ENUNCIADO OK
desarrollar un algoritmo que lea un número N entero positivo de cualquier número de dígitos, 
calcule la suma de sus dígitos y que imprima en pantalla el número leído y la suma de sus dígitos. 
Se requiere que en el desarrollo utilice la Estructura Cíclica Mientras.
Ejemplo: N= 3567 --- SUMA= 21
 */
package ejercicio4;
import javax.swing.JOptionPane;

public class Ejercicio4 {

    private static boolean esNumero(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }//Este método recibe una cadena y al 
    //parsearla nos damos cuenta si es un número o no ya que solo los números permiten "Integer.parseInt" y esto me arroja
    //un booleano true o false dependiendo si es o no número

    public static void main(String[] args) {

        boolean sw = false;//Switch para controlar que solo se escriban enteros

        while (sw == false) {//While para obligar a ingresar número
            String numIngresado = JOptionPane.showInputDialog("Ingrese número");//Obtener dato a sumar
            if (esNumero(numIngresado) == false) {//este condicional limita el uso de números y dentro del while oblica a
                //ingresar un número o no permite sumar
                sw = false;
                JOptionPane.showMessageDialog(null, "Debe ingresar un número");

            } else {

                int suma = 0;
                int i = 0;

                while (i < numIngresado.length()) {

                    char pos1 = numIngresado.charAt(i);//posiciona el caracter recorrido en el ciclo 
                    String n = Character.toString(pos1);//Convertir el tipo char en String
                    suma = Integer.parseInt(n) + suma;//convertir String n en int para poder sumar, luego sumar
                    System.out.println("Número ingresado: " + pos1);//Mostrar cada número ingresado
                    i++;//Aumentar contador
                }
                System.out.println("suma: " + suma);//Mostrar suma completa
                sw = true;
            }
        }
    }
}
