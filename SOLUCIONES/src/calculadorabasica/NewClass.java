
package calculadorabasica;

public class NewClass {
    public static void main(String[] args) {
        int lim= 3;
        int[][] c = new int[lim][lim];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                c[i][j] = (int)(Math.random()*(9-(-9)+1)-9);
                System.out.print("\t"+c[i][j]);
            }
            System.out.println("");
        }
    }
}
