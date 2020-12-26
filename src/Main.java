import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[][] q = new int[3][];
        q[0] = new int[3];
        q[1] = new int[3];
        q[2] = new int[3];

        int[][] m = { {2, 1, 5}, {6, 7, 3}, {0, 8, 0} };
        double x = 2.5;
        double y = Math.sin(x) * 2 + 7;

        boolean f = check(m);
        System.out.println(f);
    }

    static boolean check(int[][] a) {
        // По очереди проверяем строки + столбцы
        // если сумма элементов строки != сумме эл-тов столбца => false
        for (int i = 0; i < a.length; i++) {
            int sr = 0;
            for (int j = 0; j < a.length; j++) {
                sr += a[i][j];
            }
            int sc = 0;
            for (int j = 0; j < a.length; j++) {
                sc += a[j][i];
            }
            if (sr != sc) return false;
        }
        // если дошли до конца => true
        return true;
    }
}
