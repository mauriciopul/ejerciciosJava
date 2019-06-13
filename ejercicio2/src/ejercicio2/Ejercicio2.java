/*--->  ENUNCIADO OK
una frutería ofrece las manzanas a $4.200 el kilo, con un descuento de acuerdo a la siguiente tabla:
nroKilos        %descuento
0-2             0%
2,01 - 5        10%
5,01 - 10       15%
> 10,01         20%
Desarrollar un algoritmo que permita a la frutería y al cliente conocer cuanto pagará un cliente que compre manzanas. 
 */
package ejercicio2;
import javax.swing.JOptionPane;

public class Ejercicio2 {

    public static void main(String[] args) {
        double kiloManzana = 4200;
        double cantKilos, desc, subTotPagar, totDesc, totPagar = 0;

        cantKilos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese "//Capturo cantidad de kilos convirtiendo el dato en double
                + "la cantidad de kilos a comprar"));
        if (cantKilos > 10) {
            desc = 0.2;
        } else if (cantKilos > 5) {
            desc = 0.15;
        } else if (cantKilos <= 2) {
            desc = 0;
        } else {
            desc = 0.1;
        }
        subTotPagar = (kiloManzana * cantKilos);    //Cantidad a pagar sin descuento aplicado
        totDesc = desc * subTotPagar;               //Cantidad del descuento
        totPagar = subTotPagar - totDesc;           //Cantidad a pagar con el descuento aplicado

        JOptionPane.showMessageDialog(null, "La compra de " + cantKilos + " kilos tiene un valor de: $" + Math.round(subTotPagar)
                + "\npero tiene un descuento por valor de: $" + Math.round(totDesc)
                + ",\npor lo tanto el valor a pagar es: $" + Math.round(totPagar));
    }
}
