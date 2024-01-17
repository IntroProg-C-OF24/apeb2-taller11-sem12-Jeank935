package calculadorabasica;

import java.util.Scanner;

public class parametros_3 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int limEst = 4;
        double resultado[] = new double[limEst];
        String[] nombres = new String[limEst];
        String resultadoCualit[] = new String[limEst];
        double n1, n2, n3, n4, promedio;
        String cualit = "", nombre;

        for (int i = 0; i < limEst; i++) {
            System.out.println("Escriba el nombre del estudiante");
            nombre = tcl.next();
            nombres[i] = nombre;
            System.out.println("===========================================");
            System.out.println("Ingresar nota 1, nota 2, nota 3 y nota 4");
            n1 = tcl.nextDouble();
            n2 = tcl.nextDouble();
            n3 = tcl.nextDouble();
            n4 = tcl.nextDouble();
            System.out.println("===========================================");
            promedio = (n1 + n2 + n3 + n4) / 4;
            resultado[i] = promedio;
            resultadoCualit[i] = resultCualit(resultado, limEst, promedio, cualit);
        }
        System.out.println("Nombre\t/Promedio\t/Cualitativo");
        for (int i = 0; i < limEst; i++) {
            System.out.println(nombres[i] + "\t" + resultado[i] + "\t\t" + resultadoCualit[i]);
        }
    }

    public static String resultCualit(double resultado[], int limEst, double promedio, String cualit) {
        if (promedio > 9) {
            cualit = "Sobresaliente";
        } else if (promedio > 8) {
            cualit = "Muy Bueno";
        } else if (promedio > 5) {
            cualit = "Bueno";
        } else {
            cualit = "Regular";
        }
        return cualit;
    }
}/* Nombre	/Promedio	/Cualitativo
    Jean	8.5		Muy Bueno
    Carlos	7.25		Bueno
    Paula	8.0		Bueno
    Aylis	10.0		Sobresaliente */
