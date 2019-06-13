/*--->  ENUNCIADO OK
Dada la siguiente función:
Y= x^2 – 2x 
Se requiere desarrollar un algoritmo que imprima en pantalla, para valores de x desde 1 a 10, lo siguiente:
​Presentar la solución a este ejercicio en JAVA.
a:  ​La suma de todos los valores de Y.
b:  Valores de Y múltiplos de 3.
c:  Suma de los valores de Y múltiplos de 3.
d:  Valores de Y cuyo último digito sea 5.
e:  Suma de los valores de Y cuyo último digito es 5.
 */
package ejercicio3;

public class Ejercicio3 {

    public static void main(String[] args) {

        int a = 0;
        int b = 0;
        int c = 0;
        int sumaTot = 0;
        int sumMul = 0;
        int sumUlt5 = 0;
        String mult3 = "";
        String ult5 = "";
        for (int i = 1; i < 11; i++) {
            System.out.println("--------------------------------------------------");
            a = (int) Math.pow(i, 2);
            b = 2 * i;
            c = a - b;
            sumaTot = sumaTot + c;
            if (c % 3 == 0 && c != 0) {//Validar si Y es múltiplo de 3
                sumMul = sumMul + c;
                mult3 = mult3 + Integer.toString(c) + " - ";
                System.out.println("Mod: " + c);
            }
            /*          Se imprime el ejercicio completo*/
            System.out.println("Y=x^2-2x");
            System.out.println("Y= " + i + "^2 - 2(" + i + "): " + c);
            System.out.println("Y= " + a + " - " + b + ": " + c);
            System.out.println("Y= " + c);


            /*          Validar el último número de Y             */
            String vlr = Integer.toString(c);//Convertir el valor de Y a entero
            char ult = vlr.charAt(vlr.length() - 1);//seleccionar el caracter ubicado en la última posición de la cadena
            if (ult == '5') {
                sumUlt5 = sumUlt5 + c;
                ult5 = ult5 + Integer.toString(c) + " - ";
                System.out.println("ultimo:" + ult + " <=======<");
            }
        }
        System.out.println("Suma total de Y: " + sumaTot);
        System.out.println("Múltiplos de 3: " + mult3);
        System.out.println("Suma de Múltiplos de Y: " + sumMul);
        System.out.println("Terminados en 5: " + ult5);
        System.out.println("Suma de números terminados en 5: " + sumUlt5);

    }
}
