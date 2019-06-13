/*--->  ENUNCIADO OK
Una persona deposita hoy al Banco cierta cantidad de dinero, donde le reconocen un interés del 2% mensual, capitalizado mensualmente. 
¿Cuál será el saldo al cabo de 5 años?
Formula a utilizar: Valor futuro = valor presente *(1+interes)^meses
para solucionar el Ejercicio, se requiere que usted desarrolle un algoritmo que le permita conocer a una persona ¿Cuál será el saldo al cabo de 5 años?, si deposita hoy cierta cantidad de dinero. Como resultado se debe imprimir en pantalla:
Valor consignado: $XXXX
Valor futuro en 5 años: $XXX
*/
package ejercicio1;
import javax.swing.JOptionPane;

public class Ejercicio1 {

    public static void main(String[] args) {
        double vlrDepositado = 0;
        double vlrFuturo = 0;

        vlrDepositado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor a depositar: "));
        vlrFuturo = vlrDepositado*((double)Math.pow(1.02,5*12));        
        JOptionPane.showMessageDialog(null, vlrFuturo);

    }

}
