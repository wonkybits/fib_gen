/**
 * Created by phil on 2/1/17.
 */
public class fib_gen {
    public static void main(String[] args) {
        int np1 = 0;
        int np2 = 1;
        int n;
        System.out.print(np1 + " " + np2 + " ");
        for(int i = 0; i < 15; i++) {
            n = np1 + np2;
            np1 = np2;
            np2 = n;
            System.out.print(n + " ");
        }
    }
}
