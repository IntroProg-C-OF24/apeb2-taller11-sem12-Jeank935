
package calculadorabasica;
import java.util.Scanner;
public class areas_2 {
    public static void main(String[] args) {
       Scanner tcl = new Scanner(System.in);
       double num1 ,num2 ;
       System.out.println("Selecciona una opción:");
        System.out.println("======================================");
        System.out.println("[1] Calcular el área de un triángulo");
        System.out.println("[2] Calcular el área de un cuadrado");
        System.out.println("[3] Calcular el área de un rectángulo");
        System.out.println("======================================");
        int opcion = tcl.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ingrese la base del triangulo");
                num1 = tcl.nextDouble();
                System.out.println("Ingrese la altura del triangulo");
                num2 = tcl.nextDouble();
                System.out.println("El area del triangulo es igual a "+areaTriangulo(num1, num2));
                break;
            case 2:
                System.out.println("Ingrese el lado del cuadrado");
                num1 = tcl.nextDouble();
                System.out.println("El area del cuadrado es igual a "+ areaCuadrado(num1));
                break;
            case 3:
                System.out.println("Ingrese la base del rectangulo");
                num1 = tcl.nextDouble();
                System.out.println("Ingrese la altura del rectangulo");
                num2 = tcl.nextDouble();
                System.out.println("El area del rectangulo es igual a "+ areaRectangulo(num1, num2));
                break;
        }
    }
    public static double areaTriangulo(double num1, double num2 ){
        double respuesta ;
        respuesta = num1*num2/2;
        return respuesta;
    }
    public static double areaCuadrado(double num1 ){
        double respuesta ;
        respuesta = Math.pow(num1,2);
        return respuesta;
    }
    public static double areaRectangulo(double num1, double num2 ){
        double respuesta ;
        respuesta = num1 *num2;
        return respuesta;
    }
}/* 
Selecciona una opción:
======================================
[1] Calcular el área de un triángulo
[2] Calcular el área de un cuadrado
[3] Calcular el área de un rectángulo
======================================
1
Ingrese la base del triangulo
3
Ingrese la altura del triangulo
5
El area del triangulo es igual a 7.5
run:
Selecciona una opción:
======================================
[1] Calcular el área de un triángulo
[2] Calcular el área de un cuadrado
[3] Calcular el área de un rectángulo
======================================
2
Ingrese el lado del cuadrado
3
El area del cuadrado es igual a 9.0
run:
Selecciona una opción:
======================================
[1] Calcular el área de un triángulo
[2] Calcular el área de un cuadrado
[3] Calcular el área de un rectángulo
======================================
3
Ingrese la base del rectangulo
3
Ingrese la altura del rectangulo
9
El area del rectangulo es igual a 27.0*/


