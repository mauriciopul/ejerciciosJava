/*--->  ENUNCIADO OK
Desarrollar un algoritmo que calcule el salario neto que debe recibir un vendedor de un almacén. 
Se debe tener en cuenta si tiene derecho o no al auxilio de transporte. 
Para el desarrollo del ejercicio tenga en cuenta las siguientes formulas:

​Sueldo devengado = salario básico * días laborados / 30.​
Días laborados = debe ser entre 1 y 30.​
Auxilio Transporte: Lo reciben empleados cuyo salario básico sea menor o igual a 2 salarios mínimos legales vigentes.​
Salario Mínimo Legal Vigente (2017): 737.717
Auxilio de Transporte = 83.140 * días laborados / 30 (año 2017 en Colombia).​
Comisión de Ventas: En la empresa se tiene estipulado dar una comisión de ventas del 2% sobre las ventas 
del mes de cada vendedor.​
Total devengado = sueldo devengado + comisión de ventas.​
Total deducciones = descuentos por prestamos.​
Salario Neto = Total devengado – Total deducciones (salNeto = totDevenga - totDeduccion)
​
Como resultado del ejercicio se debe imprimir en pantalla lo siguiente:

a: Cedula empleado: XXXXXX
b: Nombre Empleado: XXXXXXX
c: Salario Básico: XXXXXX
d: Auxilio de Transporte: XXXXXX
e: Comisión de Ventas: XXXXXX
f: Préstamos: XXXXXX
g: Salario Neto a Recibir: XXXXX​
 */
package ejercicio5;
import javax.swing.JOptionPane;

public class Ejercicio5 {

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
        String nom = JOptionPane.showInputDialog("Ingrese Nombre del empleado");
//-------------------|  Validador para que la cédula sea numero  |-----------------------------------------
        boolean swCed = false;//swiche para controlar que la cedula sea numerica.
        String cedula = "";
        while (swCed == false) {//Hasta que nos se ingresa una cedula numérica no se finaliza el ciclo.
            cedula = JOptionPane.showInputDialog("Ingrese Cedula del empleado");
            if (esNumero(cedula) == false) {
                JOptionPane.showMessageDialog(null, "La cédula debe ser un número");
                swCed = false;
            } else {
                swCed = true;
            }
        }
        System.out.println(cedula);
//-------------------|  Validador para que la cédula sea numero  |-----------------------------------------
        boolean swSalar = false;
        String basico = "";
        while (swSalar == false) {
            basico = JOptionPane.showInputDialog("Ingrese el salario básico del empleado");
            if (esNumero(basico) == false) {
                JOptionPane.showMessageDialog(null, "El salario debe ser numero");
                swSalar = false;
            } else {
                swSalar = true;
            }
        }
        int salBasico = Integer.parseInt(basico);

//-------------------|  Validador para que los días laborados sea numero  |-----------------------------------------
        boolean swDiasLab = false;//false no es número; true si es número
        int diasLabor = 0;
        while (swDiasLab == false) {
            String dl = JOptionPane.showInputDialog("Ingrese los días laborados entre 1 y 30");
            if (esNumero(dl) == true) {//valido que digiten dato numérico
                diasLabor = Integer.parseInt(dl);
                if (diasLabor < 1 || diasLabor > 30) {
                    swDiasLab = false;
                    JOptionPane.showMessageDialog(null, "Ingrese un número entre 1 y 30");
                } else {
                    swDiasLab = true;
                }
            }
        }
//-------------------|  Validador para que el préstamo sea numero  |-----------------------------------------
        boolean swPrest = false;
        String prest = "";
        while (swPrest == false) {
            prest = JOptionPane.showInputDialog("Ingrese préstamos realizados");
            if (esNumero(prest) == false) {
                JOptionPane.showMessageDialog(null, "El préstamo debe ser numero");
                swPrest = false;
            } else {
                swPrest = true;
            }
        }
        int presDevengado = Integer.parseInt(prest);

//-------------------| Comisión |-----------------------------------------
        double com = 0;
        double totCom = 0;
        com = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto total de las ventas en este mes"));
        totCom = com * (0.02);
        System.out.println("Comisión: " + totCom);

//-------------------| Auxilio Transporte   |-----------------------------------------
        int smlv = 737717;
        int smlv2 = smlv * 2;
        int auxTransp = 0;
        if (salBasico > smlv2) {
            auxTransp = 0;
        } else {
            auxTransp = (83140 * diasLabor) / 30;
        }
//-------------------| Sueldo Devengado   |-----------------------------------------

        double sueldoDevenga = (salBasico / 30) * diasLabor; //Salario basico por dias laborados sin Aux transporte//
        double sueldoDevengaTra = +auxTransp;//Salario basico por dias laborados con Aux transporte//

//-------------------| Total devengado |----------------------------------------------
        double totDev = 0;
        totDev = (totCom + sueldoDevengaTra) - presDevengado;

//-------------------|  Imprimir en Pantalla  |-----------------------------------------
        JOptionPane.showMessageDialog(null, ""
                + "Cédula: " + cedula + "\n"
                + "Nombre: " + nom + "\n"
                + "Salario base: $" + salBasico + "\n"
                + "Salario básico por días laborados: $" + Math.round(sueldoDevenga) + "\n"
                + "Auxilio de Transporte: $" + auxTransp + "\n"
                + "Comisión: $" + Math.round(totCom) + "\n"
                + "Préstamos: -$" + presDevengado + "\n"
                + "Salario neto a recibir: $" + Math.round(totDev) + "\n"
        );
    }
}
