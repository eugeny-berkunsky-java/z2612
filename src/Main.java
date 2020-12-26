import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int[] a = new int[4];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) max = a[i];
        }
        for (int k = max; k > 0; k--) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] >= k) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
