package calculadorabasica;

import java.util.Scanner;

public class planillaPredio_4 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double kilovatio, kilovatMes, rspt1 = 0, rspt2 = 0, inmueble;      
        System.out.println("Escriba su nombre apellido ");
        String nombre = tcl.nextLine();
        System.out.println("Escriba su cedula");
        String cedula = tcl.nextLine();
        System.out.println("=====================================");
        System.out.println("ESCOGA LA OPCION QUE DESEE GENERAR");
        System.out.println("[1] Generar planilla de luz");
        System.out.println("[2] Generar Predio de un bien");
        System.out.println("=====================================");
        int opcion = tcl.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Ingrese el valor del kilovatio");
                kilovatio = tcl.nextDouble();
                System.out.println("Ingrese el numero de kilovatios gastados en el mes");
                kilovatMes = tcl.nextDouble();
                System.out.println("Cliente " + nombre + " con cedula " + cedula + " debe cancelar el valor de: " + calcularPlanillaLuz(kilovatio, kilovatMes));
                break;
            case 2:
                System.out.println("Ingrese el valor del inmueble");
                inmueble = tcl.nextDouble();
                System.out.println("Cliente " + nombre + " con cedula " + cedula + " y tiene que pagar de predio: "+ calcularpredio(inmueble));
                break;
        }
    }

    public static double calcularPlanillaLuz(double kilovatio, double kilovatMes) {
        double rspt1;
        rspt1 = kilovatio * kilovatMes;
        return rspt1;

    }

    public static double calcularpredio(double inmueble) {
        double rspt2;
        rspt2 = inmueble * 0.2;
        return rspt2;

    }
}/* 
Escriba su nombre apellido 
Jean Cuenca
Escriba su cedula
1104867146
=====================================
ESCOGA LA OPCION QUE DESEE GENERAR
[1] Generar planilla de luz
[2] Generar Predio de un bien
=====================================
1
Ingrese el valor del kilovatio
0.39
Ingrese el numero de kilovatios gastados en el mes
106
Cliente Jean Cuenca con cedula 1104867146 debe cancelar el valor de: 41.34
Escriba su nombre apellido 
Blanca Alvarado
Escriba su cedula
1102823505
=====================================
ESCOGA LA OPCION QUE DESEE GENERAR
[1] Generar planilla de luz
[2] Generar Predio de un bien
=====================================
2
Ingrese el valor del inmueble
40098
Cliente Blanca Alvarado con cedula 1102823505 y tiene que pagar de predio: 8019.6*/
