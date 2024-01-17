package calculadorabasica;

public class valoresipp_1 {

    public static void main(String[] args) {
        int limF = 3, limC = 3;
        String pares = "", impares = "";
        int matriz[][] = new int[limF][limC];
        llenarMatriz(matriz, limF, limC);
        for (int i = 0; i < limF; i++) {
            for (int j = 0; j < limC; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println("");
        }
        System.out.println("Pares: " + separarPares(matriz, limF, limC, pares));
        System.out.println("Impares: " + separarImpares(matriz, limF, limC, impares));
    }

    public static void llenarMatriz(int matriz[][], int limF, int limC) {
        for (int i = 0; i < limF; i++) {
            for (int j = 0; j < limC; j++) {
                matriz[i][j] = (int) (Math.random() * (10 - 1 + 1) + 1);
            }
        }
    }

    public static String separarPares(int matriz[][], int limF, int limC, String pares) {
        for (int i = 0; i < limF; i++) {
            for (int j = 0; j < limC; j++) {
                if (matriz[i][j] % 2 == 0) {
                    pares = pares + matriz[i][j] + " ";
                }
            }
        }
        return pares;
    }

    public static String separarImpares(int matriz[][], int limF, int limC, String impares) {
        for (int i = 0; i < limF; i++) {
            for (int j = 0; j < limC; j++) {
                if (matriz[i][j] % 2 != 0) {
                    impares = impares + matriz[i][j] + " ";
                }
            }
        }
        return impares;
    }
}/* 
5  9  1  
5  3  1  
5  4  10  
Pares: 4 10 
Impares: 5 9 1 5 3 1 5 */
