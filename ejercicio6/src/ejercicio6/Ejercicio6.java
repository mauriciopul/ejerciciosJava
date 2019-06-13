/*--->  ENUNCIADO OK
hacer un algoritmo que imprima los primeros 20 términos de la siguiente serie:
1, 3, 6, 10, 15, 21, 28,……..
 */
package ejercicio6;
public class Ejercicio6 {

    public static void main(String[] args) {

        int c = 0;

        for (int i = 1; i <= 20; i++) {
            c = c + i;
            System.out.println(i + ": " + c);
        }
    }
}
